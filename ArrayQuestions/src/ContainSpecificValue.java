import java.util.Scanner;

public class ContainSpecificValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] a = {23,45,1,67,4};

        System.out.println("enter your element to check it is specif or not");
        int checkSpecific = scanner.nextInt();

        for (int i = 0; i < a.length-1; i++) {
            if ( a[i] == checkSpecific){
                System.out.println(true);
                break;
            }
        }
        System.out.println(false);
    }
}
