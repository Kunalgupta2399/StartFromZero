import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int [] a = { 1,2,3,4,5,6 , 8};
        int [] newA = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newA[i] = a[i];
        }
        System.out.println("Its old");
        System.out.println(Arrays.toString(a));
        System.out.println("Its new");
        System.out.println(Arrays.toString(newA));
    }
}
