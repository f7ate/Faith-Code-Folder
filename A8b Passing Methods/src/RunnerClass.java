/*Program name: Passing Methods
 *Name: Faith Uwaechi
 Date: October 30th, 2024
 Program Description: Creating a sub class with 2 methods
 */

 //Runner Class
 public class RunnerClass {
    public static void main(String[] args) {
        SubClass mySubClass = new SubClass();
        //Print out gretting
        System.out.println(mySubClass.getGreeting());

        int number = 5;
        // Run through number and return the result
        System.out.println("The square of " + number + " is: " + mySubClass.squareNumber(number));
    }
}
