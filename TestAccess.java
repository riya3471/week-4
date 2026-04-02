package weekiv;

class Parent {
    private int a = 50;
    protected int b = 80;
    public int c = 90;

    void showPrivate() {
        System.out.println("Private a: " + a);
    }
}

class Child extends Parent {

    void display() {
        System.out.println("Protected b: " + b);
        System.out.println("Public c: " + c);
    }
}

public class TestAccess {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.showPrivate();
    }
}