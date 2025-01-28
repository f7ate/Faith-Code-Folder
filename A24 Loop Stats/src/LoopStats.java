/*Project Name: Loop Stats
 Name: Faith Uwaechi
 Date: Jan 27th 2025
 Description: Run a loop from a provided start number to a provided stop number.   Total up all numbers in the group, determine all odds in the group, and determine all evens in the group.   
*/

import java.util.ArrayList;

public class LoopStats {
    //method to calculate the sum of all numbers
    public static int calculateSum (int start, int stop) {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum += i; //adding each number
        }
        return sum;
    }
}

public static ArrayList<Integer> getOddNumbers(int start, int stop) {
    ArrayList<Integer> oddNumbers = new ArrayList<>();
    for (int i = start; i <= stop; i++) {
        if (i % 2 != 0) {
            oddNumbers.add(i);
        }
    }
}
