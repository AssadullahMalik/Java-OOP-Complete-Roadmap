class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        System.out.println(m.add(10, 20));
        System.out.println(m.add(10.5, 20.5));
        System.out.println(m.add(5, 10, 15));
    }
}
