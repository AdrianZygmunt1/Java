public class SumaTablicy {
    public static void main(String[] args) {
        int[] ages = {13, 41, 14, 41, 41};
        int sum = 0;

        for (int x : ages) {
            sum += x;
            System.out.println(x);
        }

        System.out.println("Suma = " + sum);
    }
}