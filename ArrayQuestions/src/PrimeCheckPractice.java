import java.util.Scanner;

public class PrimeCheckPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean result = true;

        for (int i = 1; 2 + i < n; i++) {
            int x = 2 + i;
            System.out.println(x);
            if (n % x == 0){
                result = false;
                break;
            }
        }
        if (result){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }

    }

}
