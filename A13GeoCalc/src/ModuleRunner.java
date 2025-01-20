/*Program name: Geometry Calculator
 *Name: Faith Uwaechi
 Date: January 19th, 2025
 Program Description: You will be creating program that can complete the following calculations:

Perimeter of a Rectangle. Formula: P = 2L + 2W or 2( L + W ) 
Surface area of a  Cube.  Formula: SA = 6s2
Area of a Circle. Formula: A = πr2 or A = Pi * r2
 */

import java.util.Scanner;

public class ModuleRunner {
    public static void main(String[] args) {
        Module module = new Module();
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Choose a calculation:");
        System.out.println("1. Perimeter of a Rectangle");
        System.out.println("2. Surface Area of a Cube");
        System.out.println("3. Area of a Circle");
        System.out.println("Enter your choice: 1, 2 or 3");
        int choice = scanner.nextInt();

    }

    }
