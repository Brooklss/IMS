package pack1;

public class Product {
	private String productName,productId;
	private double price;
	private int quntitity;
	private static int totalProducts;
	static final String CATEGORY="General";
	final String SKU;
	static {
		totalProducts=0;
	}
	{
		totalProducts++;
	}
	public Product(String productName,String productId,double price,int quntitity,String SKU) {
		this.productName=productName;
		this.productId=productId;
		this.price=price;
		this.quntitity=quntitity;
		this.SKU = SKU;	
	}
	public Product() {
		SKU="UNKNOWN";
	}
	public Product(String productName,double price) {
		this(productName, "Unknown", price, 0, "Unknown");
		
	} 
	public void setName(String productName) {
		this.productName=productName;
	}
	public String getName() {
		return productName;
	}
	public void setId(String productId) {
		this.productId=productId;
	}
	public String getId() {
		return productId;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice(double price) {
		return price;
	}
	public void setQuantity(int quntitity) {
		this.quntitity=quntitity;
	}
	public int getQuantity() {
		return quntitity;
	}
	public void updateQuantity(int newQuantitiy) {
		this.quntitity+=newQuantitiy;
	}
	public void displayProduct() {
		System.out.println("Product name " + productName);
		System.out.println("Product ID " + productId);
		System.out.println("Product price " + price);
		System.out.println("Product name " + quntitity);
		System.out.println("Product SKU " + SKU);
		System.out.println("Product Catagori " + CATEGORY);
	}
	public void displayProduct(boolean showp) {
		System.out.println("Product name " + productName);
		System.out.println("Product ID " + productId);
		if(showp) {
		System.out.println("Product price " + price);}
		System.out.println("Product name " + quntitity);
		System.out.println("Product SKU " + SKU);
		System.out.println("Product Catagori " + CATEGORY);
	}
}
