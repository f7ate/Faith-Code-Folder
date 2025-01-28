/*Project Name: Cool Numbers
 Name: Faith Uwaechi
 Date: Jan 27th 2025
 Description: Complete methods isCoolNum( n ) && countCoolNumbers( n ).  isCoolNum( n) will determine if a number is a cool number.  A cool number is any number that has a remainder of 1 when divided by 3,4,5, and 6.  countCoolNumbers will count the number
of cool numbers between 6 and the parameter passed in.   
*/


public class CoolNumbers {
    public static boolean isCoolNum (int n) {
        return (n % 3 == 1) && (n % 4 == 1) && (n % 5 == 1) && (n % 6 == 1);
    }

    //Method to count num of cool numbers between 6 & given num
    public static int countCoolNumbers(int max) {
        int count = 0;

        //Loop
        for (int i = 6; i < max; i++) {
            if (isCoolNum(i)) {
                count++;
            }
        }

        return count;
    }
}
