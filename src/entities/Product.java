package entities;

public class Product {

	private long id;
	private String name;
	private double price;
	private String description;
	private String imageUri;
	
	public Product() {
	}
	
	
	
	public Product(long id, String name, double price, String description, String imageUri) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUri = imageUri;
	}



	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImageUri() {
		return imageUri;
	}
	
	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", imageUri=" + imageUri + "]";
	}
	
	
	
}
