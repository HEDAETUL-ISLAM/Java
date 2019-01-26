import java.lang.*;

public class Product implements IProduct{
	private String productName;
	private String productId;
	private double productPrice;
	private int quantity;
	
	public Product(){
		System.out.println("empty constructor");
	}
	public Product(String productName, String productId, double productPrice, int quantity){
		System.out.println("para constructor");
		this.productName=productName;
		this.productId=productId;
		this.productPrice=productPrice;
		this.quantity=quantity;
	}
	public void setProductName(String productName){
		this.productName=productName;
	}
	public void setProductId(String productId){
		this.productId=productId;
	}
	public void setproductPrice(double productPrice){
		this.productPrice=productPrice;
	}
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	public String getProductName(){
		return productName;
	}
	public String getProductId(){
		return productId;
	}
	public double getProductPrice(){
		return productPrice;
	}
	public int getQuantity(){
		return quantity;
	}
	public void addProduct(int qty){
		quantity=quantity+qty;
	}
	public void sellProduct(int qty){
		quantity=quantity-qty;

	}
	public double getTotalPrice(Product p, int qty) {
		return p.productPrice*qty;
	}

}
