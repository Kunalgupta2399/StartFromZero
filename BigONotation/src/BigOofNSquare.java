public class BigOofNSquare {
    public void log(int []array){

        //// O(n * n * n) = O(n^3)
        for(int first : array){ // O(n)
            for(int second : array){// O(n)
                for(int third: array) { // O(n)
                    System.out.println(first + "," + second + "," + third);
                }
            }
        }
    }
}
