public class FinallyBlockExample {

    public static void main(String[] args) {

        try {
            int num = 10 / 2;
            System.out.println("Result: " + num);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception occurred!");
        } 
        finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program Ends.");
    }
}
