import java.io.*;
import java.util.Scanner;

public class FileWriting {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter ur string");
        String finalStr="";
        String str=sc.nextLine();
        finalStr+=str+"\n";
        File file  = new File("textdemo.txt");
        try {
            if(!file.exists())
                file.createNewFile();
            FileWriter fileWriter = new FileWriter(file,true);

            while(true){
                str=sc.nextLine();
                if(str.equals("quite")) break;
                finalStr+=str+"\n";
            }
            fileWriter.write(finalStr);

            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
