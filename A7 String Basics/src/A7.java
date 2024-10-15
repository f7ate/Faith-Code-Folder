/*Project Name: String Basics
 Name: FAITH
 Date: Oct 15th 2024
 Description: Defining and outputing a variable.
*/

public class A7 
{
    public static void main(String[] args)
     {
        // Part One
        String message1 = "I am very happy!";
        String target1 = "very ";
        // Starting index of "very "
        int startIndex1 = message1.indexOf(target1);

        // New String without "very "
        String newMessage1 = message1.substring(0, startIndex1) + message1.substring(startIndex1 + target1.length());
        // New Message
        System.out.println(newMessage1);

        // Part Two
        String message2 = "That was great - lol";
        String target2 = "lol";
        // Starting index of "lol"
        int startIndex2 = message2.indexOf(target2);

        // New String replacing "lol" with "laugh out loud"
        String newMessage2 = message2.substring(0, startIndex2) + "laugh out loud" + message2.substring(startIndex2 + target2.length());
        // New Message
        System.out.println(newMessage2);



    }
}
