/*Program name: CFD Practical Problem
 *Name: Faith Uwaechi
 Date: January 22nd, 2025
 Program Description: Write a Bowling program that will allow the user to enter any number of bowling scores (integers between 0 and 300).  The user will enter a -1 to signal that they are done entering scores.  The application will then return the percentage of bowlers who are elite (Scores 200+) and average bowlers (less than 200). 
 */

 
 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class BowlingScores {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         ArrayList<Integer> scores = new ArrayList<>();
         int score;
 
         System.out.println("Enter bowling scores (0-300). Enter -1 to quit!");
 
         // Input scores
         while (true) {
             System.out.print("Please enter the bowling score: ");
             score = scanner.nextInt();
             
             if (score == -1) {
                 break; // End input
             }
 
             if (score >= 0 && score <= 300) {
                 scores.add(score);
             } else {
                 System.out.println("Invalid score. Please enter a score between 0 and 300.");
             }
         }
         
 
         // Calculate elite and average percentages
         int eliteCount = 0;
         int totalScores = scores.size();
 
         for (int s : scores) {
             if (s >= 200) {
                 eliteCount++;
             }
         }
 
         if (totalScores > 0) {
             double elitePercentage = (eliteCount / (double) totalScores) * 100;
             double averagePercentage = 100 - elitePercentage;
 
             System.out.println("\nResults");
             System.out.println("\nElite bowlers (200+): ");
             System.out.printf("%.2f%%%n", elitePercentage);
             System.out.println("\nAverage bowlers (<200): ");
             System.out.printf("%.2f%%%n", averagePercentage);
         } else {
             System.out.println("No scores were entered.");
         }
 
         scanner.close();
     }
 }
 