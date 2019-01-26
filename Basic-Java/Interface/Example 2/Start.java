import java.lang.*;

public class Start{
	public static void main(String arg[]){
		
		Product p1 = new Product();
		p1.setProductName("Shoe");
		p1.setProductId("bata_17");
		p1.setproductPrice(100.45);
		p1.setQuantity(2);
		System.out.println("name is : "+p1.getProductName());
		System.out.println("id is : "+p1.getProductId());
		System.out.println("price is : "+p1.getProductPrice());
		System.out.println("quantity is : "+p1.getQuantity());
		p1.addProduct(5);
		p1.addProduct(3);
		System.out.println("quantity is : "+p1.getQuantity());
		System.out.println("new price is: "+p1.getTotalPrice(p1,2));
		System.out.println("\n");
		Product p2 = new Product("Shoe","bata_17",100.45,2);
		p2.setProductName("shoe");
		p2.setProductId("apex_17");
		p2.setproductPrice(200.45);
		p2.setQuantity(4);
		System.out.println("name is : "+p2.getProductName());
		System.out.println("id is : "+p2.getProductId());
		System.out.println("price is : "+p2.getProductPrice());
		System.out.println("quantity is : "+p2.getQuantity());
		p2.addProduct(5);
		p2.addProduct(3);
		System.out.println("quantity is : "+p2.getQuantity());
		System.out.println("new price is: "+p2.getTotalPrice(p2,3));
	}
}
