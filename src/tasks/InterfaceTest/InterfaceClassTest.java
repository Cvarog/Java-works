package tasks.InterfaceTest;

/**
 * Created by Артем on 13.03.2015.
 */
public class InterfaceClassTest implements InterfaceTest {

    public void eat() {
        System.out.println("Я ем");
    }

    public void drink() {
        System.out.println("Я пью");
    }


    public static void main(String[] args) {
        InterfaceClassTest check = new InterfaceClassTest();
        check.eat();
        check.drink();

    }
}