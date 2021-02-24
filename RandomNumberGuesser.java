import java.util.Scanner;

public class RandomNumberGuesser {

public static void main (String[] args){
    // Var to pass guesses
    int guessValue;

    RNG rand = new RNG(100);

    System.out.println(rand.setValueRandomNumber());


    // object to scan the numbers
    Scanner scan = new Scanner(System.in);


    System.out.print("Enter your first guess: ");
            guessValue = scan.nextInt();

        rand.guessChecker(guessValue);


    rand.inputValidation();



}



}
