public class Foreach2D {
    public static void main(String[] args) {
        int[][] sample = {{1, 2, 3}, {4, 5, 6}, {4, 5, 6}};

        for (int[] row : sample) {
            for (int x : row) {
                System.out.println(x);
            }
        }
    }
}