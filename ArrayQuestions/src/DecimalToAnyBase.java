import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you number");
        // first we want a number to get base
        int number = scanner.nextInt();

        System.out.println("Enter you base ");
        // then base to get value
        int base = scanner.nextInt();

        int resultValue = 0; // to store the value
        int power = 1; // power to rearrange the number

        while (number > 0) {

            int dig = number % base;
            number = number / base;

            resultValue = resultValue+ dig * power;
            power = power * 10;
        }
        System.out.println(resultValue);
    }
}
