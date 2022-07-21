public class PalindromeNumber {
    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 4, 43, 77, 123, 676};
        for (int num : arr) {
            System.out.println(num + " isPalindrome = " + isPalindrome(num));
        }
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int i = 0;
        int original = x;
        int reserved = 0;

        while (x != 0) {
            int n = x % 10;
            reserved = (reserved * 10) + n;
            x = x / 10;
        }
        return original == reserved;
    }
}