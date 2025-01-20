/*Program name: Area of a Triangle
 *Name: Faith Uwaechi
 Date: January 19th, 2025
 Program Description: Calculate the area of a triangle given the values for all three sides.

Perimeter = a + b + c 
Surface  = Perimeter / 2
Area = sqrt (s (s-a) (s-b) (s-c))
 */

import java.util.Scanner;

public class TriangleRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);

        //prompt for user
        System.out.println("Enter side a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter side b : ");
        double b = scanner.nextDouble();
        System.out.println("Enter side c : ");
        double c = scanner.nextDouble();

        //calculate the perimeter
        double perimeter = triangle.calculatePerimeter(a, b, c);
        //calculate the area
        double area = triangle.calculateArea(a, b, c);

        //output
        System.out.println("The perimeter of the triangle is: " + perimeter);
        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
    
}
