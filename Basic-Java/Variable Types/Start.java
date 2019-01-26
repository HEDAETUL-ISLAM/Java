//u need to creat  class name Start
import java.lang.*;

public class Start{
	public static void main(String []args){	
		VariableType o1 = new VariableType();
		o1.setAll(1,2);
		o1.printAll();
		
		VariableType o2 = new VariableType(10, 20);
		o2.printAll();
		
		o1.m1 = 100;
		o1.m2 = 200;
		o1.printAll();
		o2.printAll();
		VariableType.m2 = 300;
		o1.printAll();
		o2.printAll();
	}
}
