//burger inherit the food items class 
//u need to make  class name Burger
import java.lang.*;

public class Burger extends FoodItem{ //here burger inherited food items attribute
	private int numberOfPatties;
	public Burger(){
		System.out.println("empty burger");	
	}
	public Burger(int numberOfPatties,double price, String name){
		System.out.println("paramiterised burger");
		this.name=name;
		this.numberOfPatties=numberOfPatties;
		this.price=price;	
	}
	public void setnumberOfPatties(int numberOfPatties){
		this.numberOfPatties=numberOfPatties;
	}
	public int getnumberOfPatties(){
		return numberOfPatties;	
	}
}

