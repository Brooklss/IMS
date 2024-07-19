package pack2;
import java.util.*;
import pack1.*;
public class Main {

	public static void main(String[] args) {
		
		Inventory invent=new Inventory(4);
		Scanner scan=new Scanner(System.in);
		int choise =0;
		do {
		System.out.println("Choose what you wana do");
		System.out.println("1:add product");
		System.out.println("2:display product");
		System.out.println("0:leave");
		choise=scan.nextInt();

		if(choise==1) {
			Product pro=new Product();
			System.out.println("add product name");
			String prodcutName = scan.next();
			pro.setName(prodcutName);

			System.out.println("add product ID");
			String prodcutid = scan.next();
			pro.setId(prodcutid);

			System.out.println("add product Price");
			int prodcutprice = scan.nextInt();
			pro.setPrice(prodcutprice);
			
			System.out.println("add product Quantity");
			int prodcutquan = scan.nextInt();
			pro.setQuantity(prodcutquan);
			invent.addProduct(pro);
		}else if(choise==2) {
			invent.Display();
		}
			
		}
		while(choise!=0);

}}
