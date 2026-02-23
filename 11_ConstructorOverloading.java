class Book {
    String title;
    double price;

    Book() {
        title = "Unknown";
        price = 0.0;
    }

    Book(String t) {
        title = t;
        price = 0.0;
    }

    Book(String t, double p) {
        title = t;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming");
        Book b3 = new Book("Advanced Java", 499.99);

        b1.display();
        b2.display();
        b3.display();
    }
}
