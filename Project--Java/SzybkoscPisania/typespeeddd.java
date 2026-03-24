package SzybkoscPisania;
import java.time.*;
import java.util.*;
import java.lang.Thread;

class gra {
    static void wait1s() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    Random rand = new Random();
    String[] words;
    int blad;
    LocalTime rekord;
    String info;

    public void start() {
        Scanner sc = new Scanner(System.in);
        int bledy = 0;
        LocalTime now = LocalTime.now();
        System.out.println(1);
        wait1s();
        System.out.println(2);
        wait1s();
        System.out.println(3);
        wait1s();
        System.out.println("Start!\n");
        wait1s();
        for (int liczbaSlow = 0; liczbaSlow < 10; liczbaSlow++) {
            int losoweSlowo = rand.nextInt(words.length);
            String randSlowo = words[losoweSlowo];
            System.out.println("\n");
            System.out.println("==========================");
            System.out.println(randSlowo);
            System.out.println("==========================");
            System.out.println("\n");
            System.out.println("Napisz wyraz: ");
            String wyraz = sc.nextLine();
            if (wyraz.equals(randSlowo)) {
                System.out.println("\n==========================");
            } else {
                bledy++;
                System.out.println("\n==========================");
            }
        }
        LocalTime end = LocalTime.now();
        System.out.println("- Czas rozpoczęcia: "
                + String.format("%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond()));
        System.out.println("- Czas rozpoczęcia: "
                + String.format("%02d:%02d:%02d", end.getHour(), end.getMinute(), end.getSecond()));
        System.out.println("- Liczba błedów: " + bledy + info);
        bledy = bledy * blad;
        Duration diff = Duration.between(now, end);
        diff = diff.plusSeconds(bledy);
        long hours = diff.toHours();
        long minutes = diff.toMinutes() % 60;
        long seconds = diff.getSeconds() % 60;
        System.out.println("- Różnica: " + hours + " godzin, " + minutes + " minut, " + seconds + " sekund");
        LocalTime towjczas = LocalTime.of((int) hours, (int) minutes, (int) seconds);
        if (towjczas.equals(rekord)) {
            System.out.println("\nIdeolo");
        } else if (towjczas.isBefore(rekord)) {
            System.out.println("\nZa szybko!");
        } else {
            System.out.println("\nZbyt wolno!");
        }
        System.out.println("=========================");
        System.out.println("|          exit         |");
        System.out.println("=========================");
        String exit = sc.nextLine();
    }
}

class easy extends gra {
    easy() {
        words = new String[] {
                "cat", "dog", "sun", "sky", "map", "pen", "cup", "bed", "car", "box",
                "hat", "red", "run", "eat", "toy", "pie", "ice", "day", "boy", "girl",
                "milk", "book", "tree", "door", "star", "rain", "wind", "ship", "fish", "snow"
        };
        rekord = LocalTime.of(0, 0, 20);
        info = " (1 blad = +2s)";
        blad = 2;
    }
}

class medium extends gra {
    medium() {
        words = new String[] {
                "apple", "table", "chair", "water", "bread", "money", "phone", "light", "house", "plant",
                "beach", "train", "clock", "glass", "sugar", "paper", "river", "stone", "music", "power",
                "dream", "world", "smile", "story", "happy", "quick", "clean", "drive", "write", "learn"
        };
        rekord = LocalTime.of(0, 0, 30);
        info = " (1 blad = +3s)";
        blad = 3;
    }
}

class hard extends gra {
    hard() {
        words = new String[] {
                "computer", "keyboard", "internet", "education", "knowledge", "beautiful", "different", "important",
                "language", "adventure", "solution", "practice", "training", "business", "engineer", "software",
                "database", "security", "strategy", "analysis", "technology", "development", "environment",
                "communication", "responsibility", "organization", "opportunity", "information", "creativity",
                "productivity"
        };
        rekord = LocalTime.of(0, 0, 40);
        info = " (1 blad = +4s)";
        blad = 4;
    }
}

public class typespeeddd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean i = true;
        while (i) {
            System.out.println("====================================");
            System.out.println("|    Wybiersz poziom trudnosci     |");
            System.out.println("====================================");
            System.out.println(
                    "| 1 = easy (np. sky min. 20s)      |\n| 2 = medium (np. bread min. 30s)  |\n| 3 = hard (np. education min. 40s)|");
            System.out.println("====================================");
            System.out.println("|             4 = Exit             |");
            System.out.println("====================================");
            System.out.print("Wpisz liczbę: ");
            int d = sc.nextInt();
            
            if (d == 1) {
                easy gra1 = new easy();
                gra1.start();
                sc.close();
            } else if (d == 2) {
                medium gra2 = new medium();
                gra2.start();
                sc.close();
            } else if (d == 3) {
                hard gra3 = new hard();
                gra3.start();
                sc.close();
            } else if (d == 4) {
                System.out.println("Dziekuje");
                sc.close();
                break;
            } else {

            }
        }

    }
}
