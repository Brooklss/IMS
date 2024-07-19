package pack2;
import pack1.*;
import java.util.*;
public class Inventory {
	private int capacity,productCount;
	private Product[] products;
	
	public Inventory (int capacity ) {
		this.capacity=capacity;
		this.products=new Product[capacity];
		this.productCount=0;
		
	}
	public void addProduct(Product product) {
		if (productCount < capacity) {
			products[productCount]=product;
			productCount++;
			System.out.println("added:"+ product.getName());
		}
		else
			System.out.println("Capacity full");
	}
	public void rmProduct(String productId) {
		
	}
	public void Display() {
		for(int i=0;i< productCount;i++) {
			products[i].displayProduct();
			System.out.println();
		
		}
		
	}
	
}
