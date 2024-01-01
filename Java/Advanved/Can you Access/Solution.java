import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Inner in = new Inner();
        Inner.Private inner = in.new Private();
        if (inner.powerof2(num)) {
            System.out.println(num + " is power of 2");
        } else {
            System.out.println(num + " is not a power of 2");
        }
        System.out.println("An instance of class: Solution.Inner.Private has been created");

        // Closing the scanneranner to prevent resource leak
        scanner.close();
    }
}

class Inner {
    public class Private {
        public boolean powerof2(int n) {
            return (n & (n - 1)) == 0;
        }
    }
}
