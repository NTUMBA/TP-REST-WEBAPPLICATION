package resource.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/produit")
public interface IProduitRestResource {
	@Path("/test/{nom}")
	@GET
	String sayHello(final @PathParam("nom") String nom);

}


