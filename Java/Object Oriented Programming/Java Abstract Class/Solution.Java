import java.util.Scanner;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    // Implementing the abstract method from the base class
    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        // Creating an instance of MyBook
        MyBook newNovel = new MyBook();

        // Setting the title using the implemented method
        newNovel.setTitle(title);

        // Getting and printing the title
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
