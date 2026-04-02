package weekiv;

class Person {
    protected String address;
}

class Employee extends Person {
    String department;

    void setData() {
        address = "Biratnagar";
        department = "IT";
    }

    void display() {
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
    }
}

public class TestProtected {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setData();
        e.display();
    }
}