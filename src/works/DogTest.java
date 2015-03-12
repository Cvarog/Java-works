package works;

/**
 * Created by Admin on 11.03.2015.
 */
public class DogTest {
    public static void main(String[] args) {

        Dog woofy = new Dog("Woofy");
        woofy.setSize(10);
        System.out.println(woofy.getSize());
        System.out.println(woofy.getName());
    }
}
