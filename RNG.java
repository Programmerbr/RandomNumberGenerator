import java.util.Random;
import java.util.Scanner;

public class RNG {

    private int numberRandom;
    private int randomNumber;
    int guessNumber;


// Class constructor to initialize the random number generator
    RNG(int initialValue) {

        numberRandom = initialValue;

    }

    // This method generates the random number
    public int setValueRandomNumber(){

        Random rand = new Random();

        // random number initialize limited to 100 - this is the initial value
        randomNumber = rand.nextInt(numberRandom)+1;

        return randomNumber;
    }

    // This method returns the random number generated
    public int returnValueRandomNumber(){

        int returnedGuessNumber = randomNumber;

        return returnedGuessNumber;

    }

    // This Method receive the First GUESS
    public void guessChecker (int guessValue){

        guessNumber = guessValue;

    }

    // This Method return the FIRST GUESS VALUE
    public int returnGuessChecker (){

    int guessNumberreturn = guessNumber;

        return guessNumberreturn;
    }

    // This method does the input validation
    public int inputValidation (){

        int guessValue = returnGuessChecker();

    //Variable that gives a range to find the right number
        int randonNumberDeductor = returnValueRandomNumber()-7;
        int randonNumberSum = returnValueRandomNumber()+7;

        Scanner scan = new Scanner(System.in);


        if (guessValue == returnValueRandomNumber()){
            System.out.println("CONGRATULATIONS, YOU GUESSED THE NUMBER!");
        }

            if (guessValue != returnValueRandomNumber()) {



                for (int i = 1; i < 7; i++) {

                    if (guessValue < returnValueRandomNumber()) {

                        randonNumberDeductor++;
                        randonNumberSum--;

                        System.out.println("This number does not MATCH the random number");
                        System.out.print("Enter a HIGHER number: ");
                            System.out.print("Try a number between " +randonNumberDeductor + " to " + randonNumberSum );

                        guessValue = scan.nextInt();



                    } else if (guessValue > returnValueRandomNumber()) {

                        randonNumberDeductor++;
                        randonNumberSum--;

                        System.out.println("This number does not MATCH the random number");
                        System.out.print("Enter a LOWER number: ");
                        System.out.print("Try a number between " +randonNumberDeductor + " to " + randonNumberSum );
                        guessValue = scan.nextInt();

                    }

                    else if (guessValue == returnValueRandomNumber()){
                        System.out.println("CONGRATULATIONS, YOU GUESSED THE NUMBER!");
                        return 0;
                    }

                }

                System.out.println("YOU LOST!");
            }





        return 0;
    }






}
