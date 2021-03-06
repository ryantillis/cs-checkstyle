// Mistake: no comments on fields
/**
 * Command-line utility to generate a list of squares
 *
 * @author Tyler Bletsch (tkbletsc@ncsu.edu)
 * @version 1.0
 */
public class Fail4 {
    private static final String TITLE = "Awesome number square-er by Tyler Bletsch";
    private static final int MAX_VALUE = 10;
    
    /**
     * Square the provided number.
     * @param x  The number to square.
     * @return   The square of the given number.
     */
    private static int square(int x) {
        return x * x;
    }
    
    /**
     * Executed at program launch, prints the squares of integers 0..MAX_VALUE.
     * @param args  Command line arguments, ignored.
     */
    public static void main(String[] args) {
        System.out.println(TITLE);
        for (int i = 0; i <= MAX_VALUE; i++) {
            System.out.print(i);
            System.out.print(" ");
            System.out.println(square(i));
        }
    }
}
