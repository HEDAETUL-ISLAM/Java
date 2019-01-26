import ExcepUserDefine.ExcepUserDefine;

import java.util.Scanner;

public class Main {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int x=1;
        do{
            try {
                System.out.println("enter a number: ");
                int i = sc.nextInt();
                System.out.println("enter second number: ");
                int j = sc.nextInt();
                int k;
                k = j / i;
                if (k == 0)
                    throw new ExcepUserDefine("this is not possible");
                System.out.println(k);
            }
            catch(ExcepUserDefine e){
                System.out.println("u cnat do this"+"\n2"+e.getMessage());
            }
        }while(x==1);
    }

}
