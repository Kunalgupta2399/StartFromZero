import java.util.Scanner;

public class DifferenceTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scanner.nextInt();
        }
        int[] difference =  new int[n2];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = difference.length - 1;

        int carry = 0;

        while (k >= 0){

        }
    }
}
