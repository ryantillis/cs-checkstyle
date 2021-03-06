// Mistake: no @author
/**
 * Command-line utility to generate a list of squares
 *
 */
public class Fail3 {
    /** Title banner for this amazing program */
    private static final String TITLE = "Awesome number square-er by Tyler Bletsch";
    
    /** We'll count up to the number */
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
