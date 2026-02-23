class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

public class 10_ParameterizedConstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 101);
        e1.display();
    }
}
