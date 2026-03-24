public class Silnia {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Silnia z " + number + " wynosi " + fact(number));
    }

    static int fact(int num) {
        int res = 1;
        for (int x = 1; x <= num; x++) {
            res *= x;
        }
        return res;
    }
}