public class SwitchPrzyklad {
    public static void main(String[] args) {
        int p = 2;

        switch (p) {
            case 1: p = 2;
            case 2: p = 3;
            case 3: p = 4;
        }

        System.out.println(p);
    }
}