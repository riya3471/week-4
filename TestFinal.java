package weekiv;

final class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}

class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
}

public class TestFinal {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();

        Child c = new Child();
        c.display();
    }
}