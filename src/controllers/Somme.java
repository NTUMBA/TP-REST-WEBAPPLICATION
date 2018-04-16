package controllers;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import bean.ProduitDto;
import resource.soap.CalculatorSoap;


@WebServlet("/Somme")
public class Somme extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest requete,final HttpServletResponse response) throws ServletException, IOException {
		final URL url = new URL("http://localhost:8081/webApplication/testSOAP?wsdl");
		// First argument service URI, referrr to wsdl document above
		// Second argument is service name, refer to wsdl document above
		final QName qname = new QName("http://soap.resource/", "CalculatorService");
	
		final Service service = Service.create(url, qname);
		
		final CalculatorSoap calculatorSoap = service.getPort(CalculatorSoap.class);
		
		final int somme = calculatorSoap.somme(1, 3);
		System.out.println(somme);
		response.getWriter().append("Somme :" + somme);
		
		final ProduitDto produitDto = calculatorSoap.getProduit();
		System.out.println(produitDto);
		response.getWriter().append("\nProduit :" + produitDto);
		
	
	}
	
	

}
