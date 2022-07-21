public class PalindromeNumber {
    public static void main(String[] args) {
        int[] isPaliondrome = {1, 6, 9, 4, 77};
        System.out.println(isPaliondrome);
    }

    public boolean isPaliondrome(int x){
        if (x<0) {
            return false;
        }
        int i=0;
        int original = x;
        int reserved = 0;

        while (x !=0) {
            int n = x%10;
            reserved = (reserved * 10) + n;
            x=x/10;
        }
        return  original == reserved;
    }
}
