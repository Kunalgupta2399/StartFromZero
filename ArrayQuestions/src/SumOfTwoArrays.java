import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scanner.nextInt();
        }

        int[] sum;
        int carry = 0;
        if (n1 > n2) {
            sum = new int[n1];
        } else {
            sum = new int[n2];
        }

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            // where digit denotes the sum of i  and j
            int digit = carry;

            if (i >= 0) {
                digit = digit + a1[i];
            }

            if (j >= 0) {
                digit = digit + a2[j];
            }

            carry = digit / 10;
            digit = digit % 10;

            sum[k] = digit;
            i--;
            j--;
            k--;
        }
        if (carry !=0){
            System.out.println(carry);
        }
        for (int value: sum){
            System.out.println(value);
        }
    }
}
