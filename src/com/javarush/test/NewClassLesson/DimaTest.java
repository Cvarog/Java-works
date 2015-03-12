package com.javarush.test.NewClassLesson;

/**
 * Created by Артем on 28.02.2015.
 */
public class DimaTest
{
    static void f1(int b){
        b++;
    }
    static void f2(Integer b){
        b++;
    }
    public static void main(String[] args)
    {
        int a1 = 1;
        Integer a2 = 1;

        System.out.println(Math.random() * 10);


        f1(a1);
        f2(a2);

        System.out.println(a1);
        System.out.println(a2);

        String a = "мяф";
        StringBuilder b = new StringBuilder("Сад");
        System.out.println(b);

        String str1 = new String("Привет");
        String str2 = new String("Привет");


        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }

}
