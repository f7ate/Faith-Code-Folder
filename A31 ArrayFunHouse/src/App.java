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

        // Sum the values of positions listed (e.g. array[3] to array[6])
        System.out.println("sum of spots 3-6 = " + getSum(one, 3, 6));
        System.out.println("sum of spots 2-9 = " + getSum(one, 2, 9));

        //Count the number of occurrences of the number in the array
        System.out.println("# of 4s = " + getCount(one, 4));
        System.out.println("# of 9s = " + getCount(one, 9));

        System.out.println("Array 1 after removing 4: " + Arrays.toString(removeVal(one, 4)));

        //Array Number Two
        int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};

        System.out.println("Array 2: " + Arrays.toString(two));

        //Cound the number of occurences of a number
        System.out.println("# of 7s = " + getCount(two, 7));
        System.out.println("# of 9s = " + getCount(two, 9));

        //Remove all occurrences of a number
        System.out.println("Array 2 after removing 7: " + Arrays.toString(removeVal(two, 7)));
    }

    public static int getSum(int[] numArray, int start, int stop) {



    }
}
