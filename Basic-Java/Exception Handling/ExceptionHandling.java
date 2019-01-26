import java.util.*;

public class ExceptionHandling{
  public static void main(String arg[]){

    Scanner sc = new Scanner(System.in);

    int x=1;
    do{
      try{
        System.out.println("enter a number: ");
        int i = sc.nextInt();
        System.out.println("enter second number: ");
        int j = sc.nextInt();
        int k;
        k=j/i;
        System.out.println("ur output is: "+k);
        x=2;
      }
      catch(ArithmeticException e){
        System.out.println("u cnat do this");
      }
    }while(x==1);
  }
}
