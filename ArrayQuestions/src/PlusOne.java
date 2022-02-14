import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int [] a = {1,2,9};
        for (int i = a.length-1; i >= 0; i--) {
            if (a[i] < 9 ){
                a[i]++;
                break;
            }else {
                a[i] = 0;
            }
        }
        if (a[0]== 0){
            int [] newA = new int[a.length+1];
            a[0] = 1;
            System.out.println(Arrays.toString(newA));
        }

        System.out.println(Arrays.toString(a));
    }
}
