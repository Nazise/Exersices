public class PositiveNum {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, -1, -2, -3};
        for (Integer i : ints) {
            System.out.printf("%d is negative %b\n", i, i < 0);
        }
    }
}
