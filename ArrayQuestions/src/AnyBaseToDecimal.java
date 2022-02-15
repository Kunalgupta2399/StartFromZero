import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = scanner.nextInt();

        System.out.println("Enter you base");
        int base = scanner.nextInt();

        int decimal = anyBaseToDecimal(number , base);
        System.out.println(decimal);


    }

    private static int anyBaseToDecimal(int number, int base) {
        int resultValue = 0;

        int power = 1;
        while (number > 0){
            int deg = number % 10;
             number = number / 10;

            resultValue = resultValue + deg * power;
            power = power * base;
        }
        return  resultValue;
    }
}
