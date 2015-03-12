package tasks;

import java.security.Timestamp;
import java.sql.Time;
import java.util.*;
import java.text.*;

/**
 * Created by Артем on 26.02.2015.
 */
public class StringBuilderCheck
{
    public static void main(String[] args)
    {
        StringBuilder a = new StringBuilder();
        a.append("Машина");
        a.append("Корова");
        System.out.println(a.indexOf("Корова"));
        System.out.println(a);

        Character ch = new Character('a');
        System.out.println(Character.isLowerCase(ch));

        //Work with Date

        Date data = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(data));

        String x = a.length() > 10 ? "Больше" : "Меньше";
        System.out.println(x);

        Date currentDate = new Date();
        System.out.println(currentDate.getTime());


    }
}
