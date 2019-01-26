import java.io.File;

public class Main {
    public static void main(String s[]){

        File folder = new File("/home/hedaetul/Hedaetul/my programs/java/Making folder or Directory/person");
        folder.mkdir();
        String dloc = folder.getAbsolutePath();
        System.out.println(dloc);
        System.out.println(folder.getName());
        if(folder.delete()){                                          //used for fiolder delete
           System.out.println(folder.getName()+"ur folder deleted");
        }
    }
}
