import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        System.out.println("Enter the array length");
        int n = scanner.nextInt();

        System.out.println("Enter your array");
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("enter you element to find its index");
        int element = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (element == a[i]){
               index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
