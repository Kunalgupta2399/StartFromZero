import java.util.Arrays;

public class InsertionSortRunner {
    public static void main(String[] args) {
        int [] array = {2,4,3,5,7,4,9};
        InsertionSort s1 = new InsertionSort();
        array = s1.sort1(array);
        System.out.println(Arrays.toString(array));
    }
}
