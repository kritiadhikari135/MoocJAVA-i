public class AdvancedAstrology {

    // Part 1: Print stars
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    // Part 1: Print spaces (no line break)
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    // Part 2: Print right-leaning triangle
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);   // print leading spaces
            printStars(i);          // print stars
            System.out.println();   // move to next line
        }
    }

    // Part 3: Print Christmas tree
    public static void christmasTree(int height) {
        // Print the triangle part
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);         // spaces to center the stars
            printStars(2 * i - 1);           // odd number of stars for each row
            System.out.println();
        }

        // Print the base (2 rows of 3 stars centered)
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);         // center the base
            printStars(3);
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
