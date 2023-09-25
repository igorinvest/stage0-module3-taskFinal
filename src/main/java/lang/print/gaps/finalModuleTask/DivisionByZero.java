package lang.print.gaps.finalModuleTask;

public class DivisionByZero {
    public static void main(String[] args) {
        int number = 10;
        try {
            // Protected code
            System.out.println(number/0);
        } catch (ArithmeticException e1) {
            // Catch block
            System.out.println(e1.getMessage());
        }

    }
}
