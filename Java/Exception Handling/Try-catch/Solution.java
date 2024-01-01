import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();

            // Check if denominator is zero
            if (denominator == 0) {
                throw new ArithmeticException("/ by zero");
            }

            // Perform division
            int result = numerator / denominator;

            System.out.println(result);

        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");

        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        }
    }
}