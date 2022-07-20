public class changes {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("Before: a =" + a + "; b=" +b);
        a = a^b^(b=a);
        System.out.println("After: a=" + a + "; b=" +b);
    }
}
