import java.util.Scanner;

public class RandomNumberGuesser {

public static void main (String[] args){
    // Var to pass guesses
    int guess;

    RNG rand = new RNG(100);

    System.out.println(rand.returnValueRandomNumber());



    Scanner scan = new Scanner(System.in);


    System.out.print("Enter your first guess: ");
            guess = scan.nextInt();

    rand.setValueRandomNumber(guess);


if (rand.returnValueRandomNumber() < guess){

    System.out.print ("This number is smaller than the random number");
}
else if (rand.returnValueRandomNumber() == guess){
    System.out.print("This number matches the random number!");
}
else {
    System.out.print("This number is bigger tha the random number");
}

gu



}
}
