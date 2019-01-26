import java.lang.*;

public class VariableType{
	int m1;  //instance variable
	static int m2;  //class variable
	
	public VariableType(){
		System.out.println("Empty VariableType");
	}
	public VariableType(int m1, int m2){   //here same m1 and m2 is local variable for only this function
		System.out.println("Parameterized VariableType");
		this.m1 = m1;
		this.m2 = m2;
	}
	public void setAll(int m1, int m2){  //here same m1 and m2 is local variable for only this function
		System.out.println("SetAll VariableType");
		this.m1 = m1;
		this.m2 = m2;
	}
	public void printAll(){
		System.out.println("M1 : "+m1);
		System.out.println("M2 : "+m2);
	}
}

