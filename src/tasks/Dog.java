    public class Dog {

        String name = "Дефолтное имя";
        String poroda = "Дефолтная порода";
        private int size = 5;

        public int getSize() {
            return size;
        }

        public void setSize(int x) {
            size = x;
        }


        public Dog(){

        }
        public Dog(String startName, String startPoroda, int startSize) {
            name = startName;
            poroda = startPoroda;
            size = startSize;
        }


        void Gav() {
            System.out.println("Собака породы " + poroda + " и имени " + name + " лает");
        }
    }

     class Cat extends Dog {


    }
    class DogTest
    {
        public static void main(String[] args)
        {
//            Dog dog1 = new Dog();
//            dog1.name = "Диккенс";
//            dog1.poroda = "Дог";
//            dog1.size = 10;
//            dog1.Gav();
//            Dog dog2 = new Dog("Фердинант", "Лабрадор", 8);
//            dog2.Gav();
//            Dog dog3 = new Dog();
//            dog3.Gav();
//            Cat cat1 = new Cat();
//            cat1.Gav();

//            Dog[] pets;
//            pets = new Dog[3];
            Dog[] pets = new Dog[3];
            pets[0] = new Dog();
            pets[1] = new Dog();
            pets[2] = new Dog();

            pets[2].name = "Федерсон";
            pets[2].setSize(30);
            System.out.println(pets[2].getSize());
            pets[2].Gav();

            Dog kitty = new Cat();
            System.out.println(kitty.getClass().getName());


        }
    }