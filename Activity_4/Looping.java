/**
 * Activity 4 - Looping
 * OUTPUT
 *         *
 *       * *
 *     * * *
 * * * * * *
 * * * * * *
 *   * * * *
 *     * * *
 *       * *
 *         *  
 */

public class Looping {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half of the diamond

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}