import java.util.ArrayList;
public class LearnList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("myList: " + myList);
        System.out.println("------------------------------------");
//      Adding 4 at index 1
        myList.add(1,4);
        System.out.println("Adding 4 at index 1: " + myList);
        System.out.println("------------------------------------");
//      Remove element from index 1
        myList.remove(1);
        System.out.println("Remove element from index 1: " + myList);
        System.out.println("------------------------------------");
//      Get value of the element at index 3
        int value = myList.get(2);
        System.out.println("Element at index 2: " + value);
        System.out.println("------------------------------------");
//      Set value for element
        myList.set(2, 4);
        System.out.println("Set myList[2] to 4: " + myList);
        System.out.println("------------------------------------");
//      Add some elements for examples
        myList.add(2);
//      Find first index & last index
        System.out.println("myList: " + myList);
        int firstIndex = myList.indexOf(2);
        int lastIndex = myList.lastIndexOf(2);
        System.out.println("First index of 2 is: " + firstIndex);
        System.out.println("Last index of 2 is: " + lastIndex);
        System.out.println("------------------------------------");
//      Checking if list contains an element
        System.out.println("myList: " + myList);
        boolean isContain = myList.contains(4);
        System.out.println("myList contains 4 ? " + isContain);
        isContain = myList.contains(5);
        System.out.println("myList contains 5 ? " + isContain);
        System.out.println("------------------------------------");
//      addAll() method
        ArrayList<Integer> addList = new ArrayList<Integer>(){
            {
                add(5);
                add(6);
                add(7);
            }
        };
        System.out.println("myList: " + myList);
        System.out.println("addList: " + addList);
        myList.addAll(addList);
        System.out.println("myList after adding addList: " + myList);
        System.out.println("------------------------------------");
//      containsAll
        boolean isContainAll = myList.containsAll(addList);
        System.out.println("myList containsAll addList ?  " + isContainAll);
        System.out.println("------------------------------------");
//      Get size of list
        System.out.println("myList: " + myList);
        System.out.println("Size of list: " + myList.size());
//      Clear all elements
        myList.clear();
        System.out.println("mylist after clearing: " + myList);
//      Checking if list is empty
        System.out.println("Checking if list is empty: " + myList.isEmpty());
        System.out.println("------------------------------------");
    }
}
