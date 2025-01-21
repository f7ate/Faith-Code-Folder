/*Project Name: Array Fun House
 Name: Faith Uwaechi
 Date: Dec 5th 2024
 Description:  Write several array manipulation methods.  One method will sum up a section of a provided array, another method will count up how many of a certain number occur in the array, and the last method will remove all of a certain value from the array.

*/

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] one = {4, 10, 0, 1, 7, 6, 5, 3, 2, 9};

        //print out array
        System.out.println("Array 1: " + Arrays.toString(one));

        System.out.println("sum of spots 3-6 = " + getSum(one, 3, 6));
        System.out.println("sum of spots 2-9 = " + getSum(one, 2, 9));

    }
}
