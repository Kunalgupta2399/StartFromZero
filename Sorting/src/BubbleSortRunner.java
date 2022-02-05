import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {
        int [] array = { 2,4,1,5,2,8,7};
//        int [] array = { 1,2,3,4,5,6,7};
        var sorter  = new BubbleSort();
        sorter.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
