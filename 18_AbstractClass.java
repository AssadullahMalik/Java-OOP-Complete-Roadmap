abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says Meow");
    }
}

public class 18_AbstractClass {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
        c.sleep();
    }
}
