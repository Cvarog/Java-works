package tasks;

import java.util.Scanner;

/**
 * Created by Admin on 12.03.2015.
 */
public class ExeptionTrying {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        while(true) {
            try {
                a = scanner.nextInt();
                b = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Введите число");
                scanner.next();
                continue;
            }

        }
        System.out.println(a + " " + b);
        int sum = a + b;
        System.out.println(sum);
    }

}