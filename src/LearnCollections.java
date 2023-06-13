import java.util.*;
public class LearnCollections {
    public static void main(String[] args) {
//        binarySearch()
        List<String> list = new ArrayList<>() {
            {
                add("A");
                add("B");
                add("C");
                add("D");
            }
        };
        System.out.println("List: " + list);
        int index = Collections.binarySearch(list, "C");
        System.out.println("index of C is: " + index);
        System.out.println("-----------------------");
//        copy()
        List<String> srcList = new ArrayList<String>();
        List<String> destList = new ArrayList<String>();
        srcList.add("A");
        srcList.add("B");
        srcList.add("C");
        destList.add("D");
        destList.add("E");
        destList.add("F");
        Collections.copy(destList, srcList);
        System.out.println("Elements of source list: " + srcList);
        System.out.println("Elements of destination list: " + destList);
        System.out.println("-----------------------");
//        disjoint
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        //Add elements in both lists
        list1.add("Java");
        list1.add("PHP");
        list1.add("JavaScript");
        list2.add("C++");
        list2.add("C");
        list2.add("C#");
        //Check elements in both List
        boolean iscommon = Collections.disjoint(list1, list2 );
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("Output: "+iscommon);
        System.out.println("-----------------------");
//        emptyList()
        List<String> EmptyList = Collections.<String>emptyList();
        System.out.println("Empty list: "+EmptyList);
        System.out.println("-----------------------");
//        fill()
        List<String> arrList = new ArrayList<String>();
        //Add elements in the list
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        System.out.println("List elements before replacements: "+arrList);
        //Fill the list with 'JavaTpoint'
        Collections.fill(arrList,"D");
        System.out.println("List elements after replacements: "+arrList);
        System.out.println("-----------------------");
//        frequency()
        arrList = new ArrayList<String>();
        //Add elements in the list
        arrList.add("Java");
        arrList.add("COBOL");
        arrList.add("Java");
        arrList.add("C++");
        arrList.add("Java");
        System.out.println("List of elements: "+arrList);
        //Count the frequency of the given word
        System.out.println("Frequency of the word Java: "+Collections.frequency(arrList,"Java"));
        System.out.println("-----------------------");
//        indexOfSubList() & LastIndexOfSubList
        srcList = new ArrayList<>();
        //Add elements in the list
        srcList.add("A");
        srcList.add("B");
        srcList.add("C");
        srcList.add("D");
        srcList.add("C");
        srcList.add("D");
        //Create Target array list objects
        List<String> targetList = new ArrayList<>();
        //Add elements in the list
        targetList.add("C");
        targetList.add("D");
        //Check target list in source list
        index = Collections.indexOfSubList(srcList, targetList);
        int lastIndex = Collections.lastIndexOfSubList(srcList, targetList);
        System.out.println("Target list starts at index: " + index);
        System.out.println("Target list starts at last index: " + lastIndex);
        System.out.println("-----------------------");
//        max(), min()
        list = new ArrayList<>();
        //Add values in the list
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Max value: " + Collections.max(list));
        System.out.println("Min value: " + Collections.min(list));
        System.out.println("-----------------------");
//        nCopies()
        list = Collections.nCopies(3, "Hello");
        System.out.println("List: " + list);
        System.out.println("-----------------------");
//        replaceAll()
        List<Integer> numberList = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(1);
                add(4);
            }
        };
        System.out.println("List before: " + numberList);
        Collections.replaceAll(numberList, 1, 3);
        System.out.println("List after: " + numberList);
        System.out.println("-----------------------");
        //    reverse()
        numberList = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
//        replace
        System.out.println("List before: " + numberList);
        Collections.reverse(numberList);
        System.out.println("List after: " + numberList);
        System.out.println("-----------------------");
    }
}
