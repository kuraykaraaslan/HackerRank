public class Solution {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3};

        // String array
        String[] stringArray = {"Hello", "World"};

        // Print elements of the integer array
        printArray(intArray);

        // Print elements of the string array
        printArray(stringArray);
    }

}