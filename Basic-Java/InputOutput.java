import java.lang.*;
import java.util.*;
import java.io.*;

public class InputOutput{
  public static void main(String arg[])throws IOException{

    int i;
    double d;
    char c;
    String ss;

    Scanner s = new Scanner (System.in);
    BufferedReader b  = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter an integer: ");
		i = s.nextInt();
		System.out.println("Enter a double: ");
		d = s.nextDouble();
		System.out.println("Enter a char: ");
		c = s.next().charAt(0);
		System.out.println("Enter a string: ");
		ss = b.readLine();
    System.out.println("Ur entered value is: ");
    System.out.println(i);
    System.out.println(d);
    System.out.println(c);
    System.out.println(ss);

  }
}
