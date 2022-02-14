

public class FindIndexOfElement {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6};
        System.out.println(findIndex(a , 6));;

    }

    private static int findIndex(int[] a , int element) {
        int len = a.length;
        if (a == null){
            return -1;
        }

        for (int i = 0; i <= len-1; i++) {
            if (a[i] == element) {
                return i;
            }
        }
        return -404;
    }
}
