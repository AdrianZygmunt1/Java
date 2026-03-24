public class Procent {
    public static void main(String[] args) {
        perc(200, 20);
    }

    static void perc(double num, int percentage) {
        double res = num * percentage / 100;
        System.out.println(res);
    }
}