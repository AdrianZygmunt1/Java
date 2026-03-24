package Kolkoikrzyzyk;
import java.util.*;

class Powtorki {
    public void wypis(char[][] tab) {
        for (char[] wiersz : tab) {
            System.out.println("===============");
            for (char liczba : wiersz) {
                System.out.print("| " + liczba + " |");
            }
            System.out.println();
        }
    }
}

class Ticktacktoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Powtorki p = new Powtorki();
        char tablica[][] = {
                { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' }
        };
        int[][] wygrane = {
                { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 },
                { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
                { 0, 4, 8 }, { 2, 4, 6 }
        };

        while (true) {
            p.wypis(tablica);
            System.out.println("Podaj pole gr1 (x):");
            char wybor1 = sc.next().charAt(0);
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablica[i][j] == wybor1) {
                        if (tablica[i][j] != 'x' && tablica[i][j] != 'o') {
                            tablica[i][j] = 'x';
                        }
                    }
                }
            }
            char[] plaska = new char[9];
            int k = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) plaska[k++] = tablica[i][j];
            }

            for (int i = 0; i < wygrane.length; i++) {
                if (plaska[wygrane[i][0]] == plaska[wygrane[i][1]] && 
                    plaska[wygrane[i][1]] == plaska[wygrane[i][2]]) {
                    p.wypis(tablica);
                    System.out.println("WYGRAL GRACZ: " + plaska[wygrane[i][0]]);
                    return; 
                }
            }

            p.wypis(tablica);
            System.out.println("Podaj pole gr2 (o):");
            char wybor2 = sc.next().charAt(0);
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablica[i][j] == wybor2) {
                        if (tablica[i][j] != 'x' && tablica[i][j] != 'o') {
                            tablica[i][j] = 'o';
                        }
                    }
                }
            }
            
            char[] plaska1 = new char[9];
            int k1 = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) plaska1[k1++] = tablica[i][j];
            }

            for (int i = 0; i < wygrane.length; i++) {
                if (plaska1[wygrane[i][0]] == plaska1[wygrane[i][1]] && 
                    plaska1[wygrane[i][1]] == plaska1[wygrane[i][2]]) {
                    p.wypis(tablica);
                    System.out.println("WYGRAL GRACZ: " + plaska1[wygrane[i][0]]);
                    return; 
                }
            }
        }
    }
}