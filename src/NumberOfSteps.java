public class NumberOfSteps {

    public static void main(String[] args) {
        int[] arr = {14, 8, 123};
        for (int num : arr) {
            System.out.println(num + " numberOfSteps = " + helper(num, 0));
        }
    }
    public static int helper(int num, int steps) {
        if (num == 0) return steps;
        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }
}
