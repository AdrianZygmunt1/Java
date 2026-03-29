import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class workwithfiles {
  public static void main(String[] args) {
    File x = new File("...");
    if (x.exists()) {//check if the file exists
      System.out.println(x.getName() + " exists!");//get the name of the file
    } else {
      System.out.println("The file does not exist");
    }
    try{
      File y = new File("...");
      Scanner myReader = new Scanner(y);
      while (myReader.hasNext()) {
        System.out.println(myReader.next());
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }
  }
}