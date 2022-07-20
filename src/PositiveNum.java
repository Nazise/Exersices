public class PositiveNum {
    public static void main (String[] args) {
        Number[] nums = {1,2,3,-1,-2,-3};
        for (Number num:nums) {
            System.out.println(num + " is negative " +isNegative(num));
        }
    }

    private static <T extends Number> boolean isNegative(T num) {
        return  num.doubleValue() < 0;
    }
}
