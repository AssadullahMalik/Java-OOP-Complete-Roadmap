class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class 08_StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.marks = 85;
        s1.display();
    }
}
