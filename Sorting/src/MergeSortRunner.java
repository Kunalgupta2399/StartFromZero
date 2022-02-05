import java.util.Arrays;

public class MergeSortRunner {
    public static void main(String[] args) {
        int [] array = {7,2,1,0};
        var sorter = new MergeSort();
        array = sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
