import java.lang.*;
public class Encapsulate{
	private double length; //the class EncapsulateDemo is encapsulated 
	private double width;
	private double height; //as the variables are declared as private
	
	public void setLength(double l){
		length=l;
	}
	public void setWidth(double w){
		width=w;
	}
	public void setHeight(double h){
		height=h;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public void showVolume(){
		System.out.println("volume is: "+length*width*height);
	}

	//The get methods like getLength() , getWidth() , getHeight() are set as public, 
	//these methods are used to access these variables. 
	//The setter methods like setLength(), setWidth(), setHeight() are also declared 
	//as public and are used to set the values of the variables

	public static void main(String[] args){
		Encapsulate b= new Encapsulate();
		
		b.setHeight(5);
		b.setWidth(4);
		b.setLength(3);
		
		System.out.println("Length is: "+b.getLength());
		System.out.println("Height is: "+b.getHeight() );
		System.out.println("Width is: "+b.getWidth());
		b.showVolume();
	}
}// we can not access these attribute from another class without inheriting. thats the encapsulation
