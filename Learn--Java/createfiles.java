import java.util.Formatter;
import java.io.File;
import java.util.Scanner;
public class createfiles {
    public static void main(String[] args) {
        try {
            Formatter formatter = new Formatter("myfile.txt");//
            formatter.format("%s %s", "hello", "world \r\n");
            formatter.format("%s %s", "goodbye", "world \r\n");
            
            formatter.close();
            File file = new File("myfile.txt");//file class
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.next());//hello world
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
