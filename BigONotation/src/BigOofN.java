public class BigOofN {
    public void log(int [] array){
        //Total is O(1+1+n) = O(2+n) 
        System.out.println(); //O(1)
        for (int i = 0; i < array.length; i++) {  //O(n)
            System.out.println(array[i]);
        }
        System.out.println();// O(n)



        // O(n+n) = O(2n)
        for (int i = 0; i < array.length; i++) { // O(n)
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {// O(n)
            System.out.println(array[i]);
        }
    }
}
