public class RemoveElement {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int p1 = 0;
        if (a.length == 0){
            System.out.println("Empty array ");
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != val){
                a[p1++] = a[i];
            }
        }
        System.out.print(p1 + ",");
    }

}
