import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Random rand = new Random();
//        In my head this says the lowest is 1 and the highest is the upperbound of 101 which is 100
highLowGame((1 + rand.nextInt(101)));
    }




    public static void highLowGame(int randomNum){
        int usersNumGuess = 0;
        int guesses = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you think you can you guess the number I'm thinking of?");
        System.out.println("Enter a number...");
        do {

            usersNumGuess = sc.nextInt();
            guesses++;
            if(usersNumGuess == randomNum){
                System.out.printf("*** YOU WIN!!!! You guessed %s. ***\n",randomNum);
                System.out.printf("it took you %s tries", guesses);
            }else if(usersNumGuess < randomNum){
                System.out.println("TOO LOW, GO HIGHER");
                System.out.println("Enter a number...");
            } else{
                System.out.println("TOO HIGH, GO LOWER");
                System.out.println("Enter a number...");
            }

        }while (usersNumGuess != randomNum);





}
}
