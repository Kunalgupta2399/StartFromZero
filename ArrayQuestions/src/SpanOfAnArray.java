import java.util.Scanner;

public class SpanOfAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        System.out.println("Enter the array length");
        int n = scanner.nextInt();

        System.out.println("Enter your array");
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < n; i++) {
            if (a[i] > max){
                max = a[i];
            }if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("The Difference is " + (max - min));

    }
}
