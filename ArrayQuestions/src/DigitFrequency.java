import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  your number");
        int n = scanner.nextInt();

        System.out.println("Enter your number to be checked");
        int d = scanner.nextInt();

        int f = getFrequencyOfNumber(n, d);
        System.out.println(f);
    }

    private static int getFrequencyOfNumber(int n, int d) {
        int count = 0;

        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            if (dig == d) {
                count++;
            }
        }


        return count;
    }
}
