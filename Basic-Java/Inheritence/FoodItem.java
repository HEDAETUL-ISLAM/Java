
//this is parent class. here we will inherit price and name
//u need to make  class name FoodItem
import java.lang.*;

public class FoodItem{
	protected double price;
	protected String name;

	public FoodItem(){
		System.out.println("empty food item!!");
	}
	public FoodItem(double price, String name){
		System.out.println("paramiterised food item");
		this.price=price;
		this.name=name;
	}in
	public void setPrice(double price){
		this.price=price;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getPrice(){
		return price;
	}
	public String getName(){
		return name;
	}
	public void showDetails(){
		System.out.println("price: "+price+"name"+name);
	}
}


