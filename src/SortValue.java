import java.util.Arrays;
import java.util.HashMap;

public class SortValue {
    public static void main(String[] args) {
        var text = "codeleet";
        var map = new HashMap<Integer, Integer>();
        int[] array = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        Arrays.sort(array);
        var newText = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            var num = array[i];
            newText[i] = text.charAt(map.get(num));
        }
        System.out.println(newText);
    }
}
