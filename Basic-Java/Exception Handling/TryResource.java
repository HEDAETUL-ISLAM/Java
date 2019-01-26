import java.io.*;

public class TryResource{
  public static void main(String arg[])throws Exception{
    int n;
    System.out.println("enter number: ");

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
      n = Integer.parseInt(br.readLine());
    }
    System.out.println(n);
  }
}
