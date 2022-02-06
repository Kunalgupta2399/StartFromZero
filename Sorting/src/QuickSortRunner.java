import java.util.Arrays;

public class QuickSortRunner {
    public static void main(String[] args) {
        int [] array = {7,2,1,101,2,431,34};
        var sorter = new QuickSort();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));


    }
}
