package works;

class Dog {

    private String name;
    private int size;

    public Dog() {
    }

    public Dog(String a){
        this.name = a;
    }

    void setName(String a){
        this.name = a;
    }

    String getName(){
        return this.name;
    }

    void setSize(int b){
        size = b;
    }
    int getSize(){
        return size;
    }

}

