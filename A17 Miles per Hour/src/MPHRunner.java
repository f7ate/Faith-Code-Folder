/*Program name: Miles per Hour
 *Name: Faith Uwaechi
 Date: January 19th, 2025
 Program Description: Given a distance traveled (miles) and elapsed time (hours and minutes), calculate the speed in miles per hour.  

distance = rate * time          minutes / 60 = hours  ( 360 / 60 == 6 hours )
 */

import java.util.Scanner;

public class MPHRunner {
    public static void main(String[] args) {
        MilesPerHour mph = new MilesPerHour();
        Scanner scanner = new Scanner(System.in);

        //prompt for user
        System.out.println("Enter the distance traveled in miles: ");
        double distance = scanner.nextDouble();

        System.out.println("Enter the time traveled in hours: ");
        int hours = scanner.nextInt();
        System.out.println("Enter the time traveled in minutes: ");
        int minutes = scanner.nextInt();

        //calculate the speed
        double speed = mph.calculateSpeed(distance, hours, minutes);
        //output 
        System.out.println("The speed is: " + speed + " MPH.");

        scanner.close();
    
    }
}
