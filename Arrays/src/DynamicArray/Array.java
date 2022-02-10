package DynamicArray;

public class Array {

    /* In this program we Elaborate internal working of (InsertAt) function.
        (RemoveAt) function and (IndexOf) function.
    */


    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }


    public void insert(int item) {
        //If the array is full , resize it
        if (items.length == count) {

            //Create a new array (twice the size)
            int[] newItems = new int[count * 2];

            //Copy all existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            // Set "items" to this at the end
            items = newItems;
        }

        //Add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        //Validate Index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        // Shift the items to the left to fill the hole or(Box)
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
            count--;
        }


    }

    public int indexOf(int item){
        //If we find it , return index
        // Otherwise , return -1
        for (int i = 0; i < count; i++) {
            if (items[i] == item){
                return i;
             }
        }
        return -1;
    }

    public void print() {
        // Print function to print array
        //Count we use for count the element in array
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
