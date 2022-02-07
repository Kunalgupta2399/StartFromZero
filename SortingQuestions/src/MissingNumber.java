import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {3, 0, 1};
        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        for (int i = 0; i <= array.length; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
