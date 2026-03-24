public class przeciazeniemetod {
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(1.22, 2.22));
        System.out.println(max(5, 4));
    }
}
// Kiedy metody mają tę samą nazwę, ale różne parametry
// Może to być bardzo przydatne, gdy potrzebujesz tej samej funkcjonalności
// metody dla różnych typów parametrów.