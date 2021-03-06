public class MergeSort {
    public int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        //Divide this array in half and split into new array
        int middle = array.length / 2;

        //for left
        int[] left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        // for right

        int[] right = new int[array.length - middle];
        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }

        //sort each half
        sort(left);
        sort(right);

        // Merge the result
        merge(left, right, array);
        return array;
    }


    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;


        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
            while (i < left.length) {
                result[k++] = left[i++];
            }
            while (j < right.length) {
                result[k++] = right[j++];
            }
        }
    }

}