/*Project Name: Leap Year
 Name: Faith Uwaechi
 Date: Jan 27th 2025
 Description:  Write a program to determine if a year is a leap year.  A leap year is any year evenly divisible by 4 or 400.  You will need to use mod %.
*/


public class LeapYear {
    //To check if year is a leap year
    public static boolean isLeapYear (int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
