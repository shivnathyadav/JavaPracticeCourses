import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ourGuess;
        int computerNumber;
        int guesscount=0;

        Random random =new Random();
        boolean guessed=false;

        computerNumber =random.nextInt(100)+1;

        while(!guessed){
            System.out.println("Enetr your number");
            ourGuess =sc.nextInt();
            guesscount++;

            if(ourGuess == computerNumber){
                System.out.println("congratulations u guessed the number in "+guesscount +" time");
                guessed=true;
            }
            else if(ourGuess < computerNumber){
                System.out.println("your guess is low");
            }
            else if(ourGuess > computerNumber){
                System.out.println(" your gues is high");
            }


        }

    }
}
