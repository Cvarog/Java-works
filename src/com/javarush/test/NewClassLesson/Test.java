package com.javarush.test.NewClassLesson;

/**
 * Created by Артем on 24.02.2015.
 */
public class Test
{
    public static void main(String[] args){

        Animal elephant = new Animal();
        elephant.setName("Woofy");
        System.out.println(elephant.getName());
        elephant.checkSound();

        Cat marsik = new Cat();
        marsik.setName("Марсик");
        System.out.println(marsik.getName());
        marsik.checkSound();

        Animal woofy = new Animal();
        System.out.println(woofy.getName());

        Animal megaCat = new Cat();
        megaCat.setName("МегаКот");
        System.out.println(megaCat instanceof Cat);

//        int x = 0;
//            while (x <= 10) {
//                x++;
//                System.out.println(x);
//        }

//        char grad = 'C';
//
//        switch (grad){
//            case 'A':
//                System.out.println("It's A");
//                break;
//            case 'C':
//                System.out.println("It's C");
//                break;
//        }

    }

}
