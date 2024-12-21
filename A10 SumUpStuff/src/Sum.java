/*Program name: Sum Up Stuff
 *Name: Faith Uwaechi
 Date: November 19th, 2024
 Program Description: Given two numbers, calculate the sum and print the sum
 */

 public class Sum {
    private int one;
    private int two;
    private int sum; // Result of addition

    public void setNums (int num1, int num2) {
    one = num1;
    two = num2;

    }
    //To calculate the sum of numbers
    public void calculateSum() {
        sum = one + two;
    }

    public void print() {
        System.out.println("The sum of " + one + " and " + two + " is " + sum + ".");
    }
}

