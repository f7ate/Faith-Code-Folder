/*Program name: Geometry Calculator
 *Name: Faith Uwaechi
 Date: January 19th, 2025
 Program Description: You will be creating program that can complete the following calculations:

Perimeter of a Rectangle. Formula: P = 2L + 2W or 2( L + W ) 
Surface area of a  Cube.  Formula: SA = 6s2
Area of a Circle. Formula: A = πr2 or A = Pi * r2
 */


public class Geometry {
    public double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public double calculateCubeSurfaceArea(double side) {
        return 6 * side * side;
    }

    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    }
