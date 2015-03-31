package tasks;

/**
 * Created by Артем on 12.03.2015.
 */
public class PrimitiveTypes
{
    static byte a;
    static boolean x;
    String z;
    static char test(char b){
        return b;
    }

    public static void main(String[] args) {


        System.out.println(a);
        System.out.println(x);
//        System.out.println(z);
        PrimitiveTypes test = new PrimitiveTypes();
        test.z = "Привет";

        System.out.println(test.z);

        Integer b = 5;//упаковка
        b += 5;//распаковка
        int z = 10;
        Integer y = 10;
        System.out.println(b.byteValue());
        System.out.println(b.equals(z));

//        Character ch = new Character('A');
        System.out.print('\n');
        System.out.println("TEST");

        char[] charArray = {'H','e','l','l','o','.'};
        String str = new String(charArray);
        System.out.println(str);

        String fs;
        int v = 10;
        fs = String.format("I have %d money",v);
        System.out.println(fs.toUpperCase());

    }
}