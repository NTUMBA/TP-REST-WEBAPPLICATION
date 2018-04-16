package resource.soap;


import javax.jws.WebMethod;
import javax.jws.WebService;

import bean.ProduitDto;



@WebService
public interface CalculatorSoap {
	@WebMethod
	int somme(final int a, int b);
	@WebMethod
	ProduitDto getProduit();

}