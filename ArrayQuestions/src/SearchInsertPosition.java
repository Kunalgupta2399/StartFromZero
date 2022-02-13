public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] a = {1,3,5,6};
        int target = 5;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target){
                System.out.println(i);
            }
        }
    }
}
