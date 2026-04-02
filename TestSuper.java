package weekiv;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void display() {
        System.out.println("Dog Name: " + name);
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rocky");
        Dog d2 = new Dog("Julie");
        d1.display();
        d2.display();
    }
}