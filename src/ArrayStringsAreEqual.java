public class ArrayStringsAreEqual {
    public static void main(String[] args) {
        String[] arr1 = {"ab", "c"};
        String[] arr2 = {"a", "bc"};
        if (arrayStringsAreEqual(arr1, arr2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < word1.length; i++) {
            str1 = str1 + word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            str2 = str2 + word2[i];
        }
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }
}
