public class SecondHigh {

    public static void main(String[] args) throws Exception {

        int[] arr = {1, 6, 9, 4, 77};
        int sec_max = sec_max(arr);
        System.out.println(sec_max);
    }

    static int sec_max(int[] arr) throws Exception {

        int length = arr.length;
        if (length < 2) {
            throw new Exception("Массив не соответствует условиям!");
        }
        if (length == 2) {
            return (arr[0] > arr[1] ? arr[1] : arr[0]);
        }
        int max = arr[0];
        int sec_max = arr[0];

        for (int i = 1; i < length; i++) {
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];
            } else if (arr[i] > sec_max) {
                sec_max = arr[i];
            }
        }
        return sec_max;
    }
}
