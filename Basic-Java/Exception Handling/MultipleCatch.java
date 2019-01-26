import java.util.*;
public class MultipleCatch{
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
        int a[] = new int[5];
        System.out.println("enter array value");
        a[9]=sc.nextInt();                             //here i set the index number 9 thats why cath block executed
        k=j/i;
        System.out.println("ur output is: "+k);
        x=2;
      }
      catch(ArithmeticException e){
        System.out.println("u cnat do this");
      }
      catch(ArrayIndexOutOfBoundsException p){
        System.out.println("array out of limit");
      }
      catch(Exception e){                             // (Exception ) this will execute for all type of exception handeling
        System.out.println("error found");
      }
      finally{
        System.out.println("good bye");             //it will execute all time because it is finall catch bl9ock
      }
    }while(x==1);
  }
}
