import java.util.Random;

public class RNG {

    private int numberRandom;


// Class constructor to initialize the random number generator
    RNG(int initialValue) {

        numberRandom = initialValue;

    }

    public int returnValueRandomNumber(){

        int randomNumber;

        Random rand = new Random();

        randomNumber = rand.nextInt(numberRandom);

    return randomNumber;

    }



    public void setValueRandomNumber(int guess){

        int guessedNumber = guess;


    }



}
