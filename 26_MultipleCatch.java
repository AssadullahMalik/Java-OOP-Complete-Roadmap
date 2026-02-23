public class 26_MultipleCatch {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 50;   // ArrayIndexOutOfBoundsException

            int a = 10 / 0; // ArithmeticException
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred!");
        } 
        catch (Exception e) {
            System.out.println("General Exception occurred!");
        }

        System.out.println("Program continues...");
    }
}
