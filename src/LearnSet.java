import java.util.Set;
import java.util.HashSet;

public class LearnSet {
    public static void main(String[] args) {
//        Init new Set and add some elements
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(3);
        mySet.add(5);
        mySet.add(7);
        mySet.add(9);
        System.out.println("mySet: " + mySet);
//        addAll()
//        init newSet
        Set<Integer> newSet = new HashSet<>();
        newSet.add(4);
        newSet.add(6);
        System.out.println("mySet: " + mySet);
        System.out.println("newSet: " + mySet);
//        add newSet to mySet
        mySet.addAll(newSet);
        System.out.println("mySet after adding newSet: " + mySet);
//        remove()
        System.out.println("mySet: " + mySet);
        mySet.remove(5);
        System.out.println("mySet after remove element has value 5: " + mySet);
//        contains()
        System.out.println("mySet: " + mySet);
        System.out.println("mySet contains 3 ? " + mySet.contains(3));
        System.out.println("mySet contains 5 ? " + mySet.contains(5));
//        size, clear and isEmpty method
        System.out.println("mySet: " + mySet);
        System.out.println("Size of mySet: " + mySet.size());
        mySet.clear();
        System.out.println("Set after clearing: " + mySet);
        System.out.println("isEmpty: " + mySet.isEmpty());
//        removeAll()
        Set<Integer> set1 = new HashSet<>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
        Set<Integer> set2 = new HashSet<>() {
            {
                add(1);
                add(3);
            }
        };
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        set1.removeAll(set2);
        System.out.println("set1: " + set1);
//        retainAll
        set1 = new HashSet<>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
        set2 = new HashSet<>() {
            {
                add(1);
                add(3);
                add(5);
            }
        };
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        set1.retainAll(set2);
        System.out.println("set1 after retainAll(set2): " + set1);
    }
}
