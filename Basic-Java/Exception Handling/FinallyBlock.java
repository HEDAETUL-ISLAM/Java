import java.io.*;


public class FinallyBlock{

  public static void main(String arh[]) throws Exception{
    int n;
    System.out.println("enter number: ");
    BufferedReader b = null;

    try{
      b = new BufferedReader(new InputStreamReader(System.in));
      n = Integer.parseInt(b.readLine());
    }
    catch(Exception e){
      System.out.println(e);
    }
    finally{        //if i dont do this then it will show this type of error
      b.close();                        //FinallyBlock.java:11: error: 'try' without 'catch', 'finally' or resource declarations
      System.out.println("closed");
    }
  }
}
