/*Project Name: Loop Stats
 Name: Faith Uwaechi
 Date: Jan 27th 2025
 Description: Run a loop from a provided start number to a provided stop number.   Total up all numbers in the group, determine all odds in the group, and determine all evens in the group.   
*/

import java.util.ArrayList;
import java.util.Scanner;

public class LoopStatsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt user for values
        System.out.println("Enter the start number: ");
        int start = scanner.nextInt();

        System.out.println("Enter the stop number: ");
        int stop = scanner.nextInt();

    
        if (start > stop) {
            System.out.println("Error: Start number must be less than or equal to the stop number.");
        } else {
            //Calculate the total sum, odd nums and even nums
            int totalSum = LoopStats.calculateSum(start, stop);
            System.out.println("Sum of numbers from " + start + " to " + stop + ": " + totalSum);

            System.out.println("Odd numbers: " + LoopStats.getOddNumbers(start, stop));
            System.out.println("Even numbers: " + LoopStats.getEvenNumbers(start, stop));

        }

        scanner.close();
    }
}
