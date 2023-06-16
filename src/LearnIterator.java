import java.util.*;
public class LearnIterator {
    public static void main(String[] args) {
//        Create new array list and add elements
        List<Integer> list = new ArrayList<>() {
            {
                add(1);
                add(3);
                add(5);
                add(9);
            }
        };
//        Print element using iterator
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
