import java.util.*;
public class LearnResourceBunble {
    public static void main(String[] args) {
//        Get message from US
        ResourceBundle bundle = ResourceBundle.getBundle("Message", Locale.US);
        System.out.println("Message in US: " + bundle.getString("message"));
//        Get message from VN (default)
        Locale.setDefault(new Locale("vi", "VN"));
        bundle = ResourceBundle.getBundle("Message");
        System.out.println("Message in VN: " + bundle.getString("message"));
    }
}
