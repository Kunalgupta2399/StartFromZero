import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 3, 3, 4, 5, 6};
        removeDuplicate(a);
    }

    private static void removeDuplicate(int[] a) {
        if (a.length == 0) {
            return;
        }
        int p1 = 0;
        for (int p2 = 1; p2 < a.length; p2++) {
            if (a[p1] == a[p2]) {
                p2++;
            } else if (a[p1] != a[p2]) {
                a[p2] = a[p1];
                p1++;
                p2++;
            }
        }
    }
}
