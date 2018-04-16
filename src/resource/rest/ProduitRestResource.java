package resource.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/produit")
public class ProduitRestResource implements IProduitRestResource{
	
	@Override
	@Path("/test/{nom}")
	@GET
	public String sayHello(final @PathParam("nom") String nom){
		return nom;
	}
	

}