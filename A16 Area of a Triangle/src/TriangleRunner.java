/*Program name: Area of a Triangle
 *Name: Faith Uwaechi
 Date: January 19th, 2025
 Program Description: Calculate the area of a triangle given the values for all three sides.

Perimeter = a + b + c 
Surface  = Perimeter / 2
Area = sqrt (s (s-a) (s-b) (s-c))
 */

public class TriangleRunner {
    //calculate perimeter of triangle
    public double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }
        
    //calculating the are of the triangle
    public double calculateArea(double a, double b, double c) {
        double perimeter = calculatePerimeter(a, b, c);
        double s = perimeter / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
}
