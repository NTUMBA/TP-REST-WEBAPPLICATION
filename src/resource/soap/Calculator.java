package resource.soap;


import javax.jws.WebService;

import bean.ProduitDto;

@WebService(endpointInterface="resource.soap.CalculatorSoap")
public class Calculator implements CalculatorSoap {

	public Calculator() {

	}

	@Override
	public int somme(final int a, final int b) {
		return a + b;
	}

	@Override
	public ProduitDto getProduit() {
		final ProduitDto produitDto = new ProduitDto();
		System.out.println("Le produitDto :" + produitDto);
		produitDto.setId(10);
		produitDto.setDescription("Mock");
		return produitDto;
	}
}



