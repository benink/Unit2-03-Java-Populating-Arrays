import java.util.Arrays;
import java.util.Random;

/**
 * Populates arrays.
 *
 * @author Beni Nkongolo
 * @version 1.0
 * @since 2025-10-19
 */
public class PopulatingArrays {
    /**
     * This program generates 5 lines of 10 random numbers (0–100).
     * Each line is stored in an array, sorted, and displayed with its average.
     * @param args Command-line arguments (not used).
     */
    public static void main(final String[] args) {
        final int rows = 5; //number of lines
        final int collumns = 10; //numbers per line
        //2D array to store all numbers
        int[][] numbers = new int[rows][collumns];

        Random rand = new Random();

        //Generate random numbers and print them
        System.out.println("Original Random Numbers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < collumns; j++) {
                numbers[i][j] = rand.nextInt(101); //generates number from 0–100
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSorted Arrays with Averages:");
        //Sort each row and calculate average
        for (int i = 0; i < rows; i++) {
            Arrays.sort(numbers[i]); //sort the row
            double sum = 0;

            for (int j = 0; j < collumns; j++) {
                System.out.print(numbers[i][j] + "\t");
                sum += numbers[i][j];
            }

            double average = sum / collumns;
            System.out.printf(
                "Average: %.1f\n", average); //formatted to one decimal
        }
    }
}
