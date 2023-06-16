import java.util.*;

public class LearnEnum {
    public static void main(String[] args) {
        enum Level {
            LOW,
            MEDIUM,
            HIGH
        }
//        Print an Level
        System.out.println(Level.LOW);
//        Print all Level
        for (Level lv : Level.values()) {
            System.out.println(lv);
        }
    }
}
