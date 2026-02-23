class Person {
    String name;

    Person() {
        name = "Unknown";
        System.out.println("Default Constructor Called");
    }
}

public class 09_DefaultConstructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("Name: " + p1.name);
    }
}
