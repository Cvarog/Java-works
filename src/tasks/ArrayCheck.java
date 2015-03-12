package tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Артем on 07.02.2015.
 */
public class ArrayCheck
{
    static int sumArray(int[] array){
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        if (array[3] == 5)
            System.out.println("Верный ответ, третий элемент " + array[3]);
        else
            System.out.println(Arrays.toString(array));

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int elem : array1) {
//            System.out.println(elem);
//        }

        for (int i = 0; i < array1.length; i++)
        {
            array1[i] *= 2;
            System.out.println(array1[i]);

        }


        int[] array2;
        array2 = new int[1];
        array2[0] = 1;
//        array2[1] = 2;
        System.out.println(Arrays.toString(array2));

        String[] words = {"Собака", "Лошадь", "Корова"};
        for (String s: words) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Лягушка");
        myList.add("Кошка");
        System.out.println(myList.get(0));
        System.out.println(myList.indexOf("Лягушка"));
        System.out.println(myList);


        ArrayList newList = new ArrayList();

        newList.add("Rudolf");
        newList.add(10);
        System.out.println(newList);
        if (newList.isEmpty()) {
            System.out.println("Пустой массив");
        }

        LinkedList newListLinked = new LinkedList();
        newListLinked.add("Frank");
        newListLinked.add(15);
        System.out.println(newListLinked);

        String a = "Собака";
        String[] aList = a.split("");
        System.out.println(Arrays.toString(aList));

        int[] ar = {1,2,3,4,5,3};
        int x = 0;
        for (int i : ar){
            if (i > x){
                x = i;
            }
        }
        System.out.println(x);

        System.out.println(sumArray(ar));
    }
}