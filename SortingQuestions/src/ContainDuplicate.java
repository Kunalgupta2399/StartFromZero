import java.util.Arrays;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println(a[i]);
                break;
            } else {
                System.out.println("Not found");
            }
        }
    }
}
