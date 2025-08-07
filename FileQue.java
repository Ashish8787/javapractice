import java.io.File;
import java.io.FileReader;

public class FileQue {
    public static void main(String[] args) {
        try {


        File file = new File("test1.txt");
        if (file.createNewFile()) {
            System.out.println("File created");

        }else{
            System.out.println("File already exists");
        }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
