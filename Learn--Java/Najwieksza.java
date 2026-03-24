public class Najwieksza {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        int res = 0;

        for (int x : nums) {
            if (x > res) {
                res = x;
            }
        }

        System.out.println(res);
    }
}