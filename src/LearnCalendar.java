import java.util.*;

public class LearnCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Time now: " + calendar.getTime());
        calendar.add(Calendar.DATE, 5);
        System.out.println("5 days later: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 2);
        System.out.println("2 months later: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 3);
        System.out.println("3 years later: " + calendar.getTime());
    }
}
