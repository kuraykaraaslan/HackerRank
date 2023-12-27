class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {}

public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.printf("My superclass is: %s%n", adder.getClass().getSuperclass().getName());
        System.out.printf("%d %d %d%n", adder.add(10, 32), adder.add(10, 3), adder.add(10, 10));
    }
}
