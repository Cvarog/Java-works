package tasks;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Admin on 12.03.2015.
 */
public class regexptest {

    public static void main(String[] args) {

        String line = "I have 100000 dollars!";
        String pattern = "(\\d+)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if(m.find()){
            System.out.println(m.group());
        }
        else {
            System.out.println("No mach find");
        }



    }
}
