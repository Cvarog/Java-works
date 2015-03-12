package tasks;

import org.omg.CORBA.INTERNAL;

/**
 * Created by Артем on 05.02.2015.
 */

import java.util.Scanner;
public class JavaMethodsTest
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Введите Ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Ваше имя " + name);
        int number;
        while(true) {
            try {

                System.out.println("Введите Ваш возраст:");
                number = scanner.nextInt();
//                System.out.println("Вам " + number + " лет");
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Введе цифровое значение");
//                System.out.println(e);
                scanner.next();
                continue;
            }

        }
        System.out.println(name + " " + number);
    }

    public static int Sum(int a, int b)
    {
        int c = a + b;
        return c;
    }





}
