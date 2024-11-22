import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Random rand = new Random();
        int numRolls;
        int[] outcomes;
        int current;

        System.out.println("How many dice do you want to roll?");
        numRolls = keys.nextInt();
        outcomes = new int[numRolls]; //create a position for each

        for (int roll = 0; roll < numRolls; roll++) {
            //Rolling "two dice" - note nextInt(x) is a number
            //Number from 0 < num < x
            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6) + 1;
            outcomes[roll] = d1 + d2;
            System.out.println("Roll number " + roll + ":  D1 = " + d1 + " , D2 = " + d2 + " Score = " + outcomes[roll]);
        }


        System.out.println("\nThe Game Stats: ");

        int total = 0;
        double average = 0;
        for (int i = 0; i < numRolls; i++) {
            total = total + outcomes[i];
        }
        average = (double)total/numRolls;

        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);

        System.out.println (Arrays.toString(outcomes));
    }
}
