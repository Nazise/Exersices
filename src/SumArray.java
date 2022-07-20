public class SumArray {
    public  static void main(String[] args) {
        int[] myList = {1,2,3,4,5};
        int total = 0;
        for (int i=0; i<myList.length;i++){
            total +=myList[i];
        }
        System.out.println(total);
    }
}