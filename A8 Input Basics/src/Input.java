 /*Program name: Input Basics
 *Name: Faith Uwaechi
 Date: October 30th, 2024
 Program Description: Create a program that the user inputs and the program outputs 
 */

 import java.util.Scanner;
 // Importing Scanner into code

 public class Input {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      /*Part One of Program */

      //Integer inputs
      int intOne, intTwo; 
      System.out.print("Enter an integer: ");
      intOne = keyboard.nextInt();
      System.out.print("Enter another integer: ");
      intTwo = keyboard.nextInt();

      //Double inputs
      double doubleOne, doubleTwo;
      System.out.print("Enter a double: ");
      doubleOne = keyboard.nextDouble();
      System.out.print("Enter another double: ");
      doubleTwo = keyboard.nextDouble();

      /*Part Two of Program */

      //This will display the values
      System.out.println("integer one = " + intOne);
      System.out.println("integer two = " + intTwo);
      System.out.println("double one = " + doubleOne);
      System.out.println("double two = " + doubleTwo);

      //Adding the pairs of variables
      int intSum = intOne + intTwo;
      double doubleSum = doubleOne + doubleTwo;

      System.out.println("intOne + intTwo = " + intSum);
      System.out.println("doubleOne + doubleTwo = " + doubleSum);

      //Closing and Stopping scanner
      keyboard.close();
   }

}