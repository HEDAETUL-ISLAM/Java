//pizza inherit the food item class
//u need to make  class name Pizza
import java.lang.*;

public class Pizza extends FoodItem{ //here pizza inherited food items attribute
	private String size;
	
	public Pizza(){
		System.out.println("empty pizza");	
	}
	public Pizza(String size,double price, String name){
		System.out.println("paramiterised pizza");
		this.name=name;
		this.size=size;
		this.price=price;	
	}
	public void setSize(String size){
		this.size=size;
	}
	public String getSize(){
		return size;	
	}
}

