import java.util.Arrays;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        int [] a = { 1,2,3,4,5};
        int element =0;
        remSpecificElement(a , element);
        System.out.println(Arrays.toString(a));
    }
    public static void remSpecificElement(int [] a , int element){
        element = 5;
        if (a == null){
            return;
        }
            for (int i = element; i < a.length-1 ; i++) {
                a[i] = a[i+1];
            }
        }

    }
