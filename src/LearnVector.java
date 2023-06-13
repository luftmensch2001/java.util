import java.util.*;
public class LearnVector {
    public static void main(String[] args) {
//        forEach()
        //Create an empty vector
        Vector<Integer> vec = new Vector<>();
        //Add element in the vector
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        //Use forEach() method to print vector elements
        vec.forEach((value) -> System.out.println(value));
        System.out.println("--------------------------");
        //    firstElement()
        vec = new Vector<>() {
            {
                add(2);
                add(1);
                add(3);
                add(5);
            }
        };
        System.out.println("First element: " + vec.firstElement());
        System.out.println("--------------------------");
//        insertElementAt()
        vec = new Vector<>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
        System.out.println("Vector before insertion: " + vec);
//        Insert 5 at position 2
        vec.insertElementAt(5, 2);
        System.out.println("Vector after insertion: " + vec);
        System.out.println("--------------------------");
//        removeAllElements()
        vec = new Vector<>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
        System.out.println("Vector size before: " + vec.size());
        vec.removeAllElements();
        System.out.println("Vector size after: " + vec.size());
        System.out.println("--------------------------");
//        removeElement
        vec = new Vector<>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
        System.out.println("Vector before removal: " + vec);
        vec.removeElement(3);
        System.out.println("Vector after removal: " + vec);
        System.out.println("--------------------------");

    }
}
