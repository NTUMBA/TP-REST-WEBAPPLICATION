package bean;

public class ProduitDto {
	private Integer id;
	private String description;
	
	//CONSTRUCTEURS
	public ProduitDto(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public ProduitDto() {
	
	}
	
	@Override
	public String toString() {
		return "ProduitDto [id=" + id + ", description=" + description + ", getId()=" + getId() + ", getDescription()="
				+ getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	//GETTERS ET SETTERS
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
