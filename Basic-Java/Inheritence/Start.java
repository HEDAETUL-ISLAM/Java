//u need to make  class name Start
import java.lang.*;

public class Start{
	public static void main(String arg[]){

		Pizza p1 = new Pizza();  //create object and call empty constructor
		p1.setName("beef");
		p1.setPrice(1000);
		p1.setSize("10 inc");
		System.out.println("name: "+p1.getName());
		System.out.println("price: "+p1.getPrice());
		System.out.println("size: "+p1.getSize());
		Pizza p2 = new Pizza("7 inc",700,"vegetable");    //para constructor
		p2.setName("chicken");
		p2.setPrice(500);
		p2.setSize("5 inc");
		System.out.println("name: "+p2.getName());
		System.out.println("price: "+p2.getPrice());
		System.out.println("size: "+p2.getSize());

		Burger b1 = new Burger();    //create object and call empty constructor
		b1.setName("naga");
		b1.setPrice(1000);
		b1.setnumberOfPatties(10);
		System.out.println("name: "+b1.getName());
		System.out.println("price: "+b1.getPrice());
		System.out.println("patties: "+b1.getnumberOfPatties());
		Burger b2 = new Burger(7,700,"chicken");      //para constructor
		b2.setName("beef");
		b2.setPrice(500);
		b2.setnumberOfPatties(3);
		System.out.println("name: "+b2.getName());
		System.out.println("price: "+b2.getPrice());
		System.out.println("patties: "+b2.getnumberOfPatties());
	}
}
