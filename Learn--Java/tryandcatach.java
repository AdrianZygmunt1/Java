import java.lang.Thread;

public class tryandcatach {

    public static void main(String[] args) {
        try {
            Thread.sleep(1000); //czaka 1s 1000milisekund = 1s
        } catch (InterruptedException e) {
            System.out.println("Coś przerwało sen programu");
        }
    }
}