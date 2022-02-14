package DynamicArray;

import DynamicArray.Array;

public class main {
    public static void main(String[] args) {
        Array number = new Array(8);
        number.insert(10);
        number.insert(20);
        number.insert(30);
        number.insert(40);
        number.insert(50);
        number.insert(60);
        number.insert(70);
        number.insert(80);
        number.insert(90);

//        System.out.println(number.indexOf(100));
//        number.removeAt(3);
        number.print();
    }
}
