/*Program name: Geometry Calculator
 *Name: Faith Uwaechi
 Date: January 19th, 2025
 Program Description: You will be creating program that can complete the following calculations:

Perimeter of a Rectangle. Formula: P = 2L + 2W or 2( L + W ) 
Surface area of a  Cube.  Formula: SA = 6s2
Area of a Circle. Formula: A = πr2 or A = Pi * r2
 */

import java.util.Scanner;

public class GeometryRunner {
    public static void main(String[] args) {
        Geometry module = new Geometry();
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Choose a calculation:");
        System.out.println("1. Perimeter of a Rectangle");
        System.out.println("2. Surface Area of a Cube");
        System.out.println("3. Area of a Circle");
        System.out.println("Enter your choice: 1, 2 or 3");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.println("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.println("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            System.out.println("Perimeter of the Rectangle: " + module.calculateRectanglePerimeter(length, width));

        } else if (choice == 2) {
            System.out.println("Enter the side length of the cube: ");
            double side = scanner.nextDouble();
            System.out.println("Surface Area of the Cube: " + module.calculateCubeSurfaceArea(side));
        
        } else if (choice == 3) {
            System.out.println("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            System.out.println("Area of the Circle: " + module.calculateCircleArea(radius));
        
        } else {
            System.out.println("Invalid choice! Please reselect and Select 1, 2, or 3 :) ");
        }

        scanner.close();
    }

    }
