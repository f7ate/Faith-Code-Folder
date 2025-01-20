/*Program name: Miles per Hour
 *Name: Faith Uwaechi
 Date: January 19th, 2025
 Program Description: Given a distance traveled (miles) and elapsed time (hours and minutes), calculate the speed in miles per hour.  

distance = rate * time          minutes / 60 = hours  ( 360 / 60 == 6 hours )
 */

public class MilesPerHour {
    public double calculateSpeed(double distance, int hours, int minutes) {
        //time into hrs
        double totalTimeInHours = hours + (minutes / 60.0);

        return distance / totalTimeInHours;
    
    }
}
