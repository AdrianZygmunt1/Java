import java.util.Scanner;

public class java_1 {
    public static void main(String[] args) {

        // Tworzenie obiektu Scanner
        Scanner sc = new Scanner(System.in);

        // String i int 
        System.out.print("Podaj swoje imię: ");
        String name = sc.nextLine();

        System.out.print("Podaj swój wiek: ");
        int age = sc.nextInt();

        System.out.println("Cześć " + name + "!");

        // if / else if / else
        if (age < 18) {
            System.out.println("Jesteś niepełnoletni");
        } else if (age >= 18 && age < 65) {
            System.out.println("Jesteś dorosły");
        } else {
            System.out.println("Jesteś seniorem");
        }

        // switch 
        System.out.print("Wybierz dzień tygodnia (1-3): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            default:
                System.out.println("Niepoprawny numer dnia");
        }

        // pętla for 
        System.out.println("Pętla for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Liczba: " + i);
        }

        // pętla while 
        System.out.println("Pętla while:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Liczba: " + j);
            j++;
        }

        // Zamknięcie Scanner
        sc.close();
    }
}