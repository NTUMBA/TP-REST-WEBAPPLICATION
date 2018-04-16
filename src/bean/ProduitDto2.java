package bean;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProduitDto2 {
	private Integer id;
	private String description;
	

	
	@Path("/{id}/xml")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public ProduitDto2 getProduit(final @QueryParam("desc") String description, final @PathParam("id") int id){
		final ProduitDto2 produitDo =new ProduitDto2();
		produitDo.setId(id);
		produitDo.setDescription(description);
		
		return produitDo;
	}
	
	//CONSTRUCTEURS
	
	public ProduitDto2(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public ProduitDto2() {
	
	}
	
	// GETTERS ET SETTERS
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
