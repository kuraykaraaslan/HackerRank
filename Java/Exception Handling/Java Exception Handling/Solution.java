import java.io.*;
import java.util.*;


class MyCalculator {
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();

            MyCalculator myCalculator = new MyCalculator();

            try {
                long result = myCalculator.power(n, p);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("java.lang.Exception: " +e.getMessage());
            }
        }

        scanner.close();
    }
}