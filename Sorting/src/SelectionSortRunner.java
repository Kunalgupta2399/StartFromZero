import java.util.Arrays;

public class SelectionSortRunner {
    public static void main(String[] args) {
        int[] array = {7,2,1,0,6,8,5,2,0,1};
        SelectionSort s1 = new SelectionSort();
        s1.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

