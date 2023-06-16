import java.io.*;
import java.util.*;
public class LearnProperties {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./files/config.properties");
        FileWriter fw = new FileWriter("./files/config.properties");
//        Create new properties
        Properties p = new Properties();
        p.load(fr);
//        Set new username and pass
        p.setProperty("username", "phuongtd001");
        p.setProperty("pass", "abcd");
        System.out.println("username = " + p.getProperty("username"));
        System.out.println("pass = " + p.getProperty("pass"));
//        Write new properties into file writer
        p.store(fw, "New username & pass");
    }
}
