package works;

import works.Animal;

/**
 * Created by Admin on 03.02.2015.
 */
public class Animaltestmy {



    public static void main(String[] args) {

        Animal marvin = new Animal();
        System.out.println(marvin.getSize());
        marvin.setSize(20);
        System.out.println(marvin.getSize());
    }
}

