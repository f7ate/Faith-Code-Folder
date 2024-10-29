public class App {
    public static void main(String[] args) throws Exception {
        
        //counting loop
        int num = 3;
        while (num > 0) {
            System.out.println(num);
            num--;
            //num = num -1; equivilant
        }

        //game loop or program loop
        boolean game = true; //trigger varibale
        while (game) {
            //program code or game coe or calculations
            System.out.println("Hello Universe");

            //kill switch, play again method
            System.out.println("Do you want to play again?");
            String userinput = "no"; //"getting user response";

            if ( userinput.equals ("no") ) {
                game = false; //trigger game to end
            }
        }


        //standard for loop in java
            //three conditions
            //for (where we start; where we end; step size)
        for(int i = 10; i > 0; i--) {
            System.out.println("The number is " + i);
        }

        //equivilant while
        int x = 10;
        while (x > 0) {
            System.out.println("The  number is " + x);
            x--;
        }
    }
}
