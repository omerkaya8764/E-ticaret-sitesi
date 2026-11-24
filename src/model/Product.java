package model;
public class Product {
	private String productID;
	private String productName;
	private double price;
	
	// Constructor (Yapıcı Metot)
	public Product(String productID, String productName, double price) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	
	// Getter ve Setter Metotları
	public String getProduct() {
		return productID;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return productName + " - " + price + " TL ";
	}
}
