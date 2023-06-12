import java.util.Date;
public class LearnDate {
    public static void main(String[] args) {
//        Constructor demo
        // Date()
        Date date1 = new Date();
        System.out.println(date1);
        // Date(miliseconds)
        long miliSeconds = System.currentTimeMillis();
        Date date2 = new Date(miliSeconds);
        System.out.println(date2);
        System.out.println("------------------------------------");
//        Methods
//        before() & after
        final long MILISECONDS_IN_A_DAY = 24 * 60 * 60 * 1000;
        date1 = new Date(miliSeconds); //today
        date2 = new Date(miliSeconds + MILISECONDS_IN_A_DAY); // tomorrow
        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
        System.out.println("Is date1 before date2 ? : " + date1.before(date2));
        System.out.println("Is date1 after date2 ? : " + date1.after(date2));
        System.out.println("------------------------------------");
//        compareTo()
        System.out.println("date1(today): " + date1);
        System.out.println("date2(tomorrow): " + date2);
        System.out.println("date1 compareTo date2 : " + date1.compareTo(date2));
        System.out.println("date1 compareTo date1 ? : " + date1.compareTo(date1));
        System.out.println("date2 compareTo date1 ? : " + date2.compareTo(date1));
        System.out.println("------------------------------------");
//        equals
        System.out.println("date1(today): " + date1);
        System.out.println("date2(tomorrow): " + date2);
        Date date3 = date1;
        System.out.println("date3(today): " + date3);
        System.out.println("date1 equals date2 : " + date1.equals(date2));
        System.out.println("date1 equals date3 ? : " + date1.equals(date3));
        System.out.println("------------------------------------");
//        getTime()
        long timeNow = new Date().getTime();
        System.out.println("Time now: " + timeNow);
        System.out.println("------------------------------------");
//        setTime()
        Date today = new Date();
        System.out.println("Before setTime: " + today);
        today.setTime(2000);
        System.out.println("After setTime: " + today);
        System.out.println("------------------------------------");
    }
}
