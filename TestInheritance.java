package weekiv;

class Animall {
    String name;
    int age;

    Animall(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animall {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void show() {
        display();
        System.out.println("Breed: " + breed);
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog("Julie", 3, "Japanese spitz");
        d.show();
    }
}