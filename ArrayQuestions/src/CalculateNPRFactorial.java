import java.util.Scanner;

public class CalculateNPRFactorial {
    public static int fact(int x) {
        int rv = 1;
        for (int i = 1; i <= x; i++) {
            rv = rv * i;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int r = sca.nextInt();

        int nFact = fact(n);

        int nmrFact = fact(n - r);

        int npr = nFact / nmrFact;
        System.out.println(npr);
    }
}
