public class CalculateAverage {
    public static void main(String[] args) {
        int [] a = {20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for (int a1 :a) {
            sum = sum + a1;
        }
        int average = 0;
        System.out.println(sum / a.length);
    }
}
