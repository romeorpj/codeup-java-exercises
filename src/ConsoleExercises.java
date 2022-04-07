import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a City name");
//        String city = scanner.nextLine();
//        System.out.println("Please enter a State name");
//        String state = scanner.nextLine();
//        int years = scanner.nextLine();
//        System.out.println("Welcome to %s, %s, I've lived here for %d years,", city,state, years);



//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f. \n", pi);

//        Why does this not accept %d

//        1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        What happens if you input something that is not an integer?

//        System.out.println("Enter an integer");
//        int newNumber = scanner.nextInt();

//2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the
// console, each on a newline.
        System.out.println("Enter word 1 below \n");
        String word1 = scanner.nextLine();
        System.out.println("Enter word 2 below \n");
        String word2 = scanner.nextLine();
        System.out.println("Enter word 3 below \n");
        String word3 = scanner.nextLine();
        System.out.printf("Your 3 words are:\n - %s\n - %s\n - %s\n",word1,word2,word3);


//        3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        System.out.println("Enter a new sentence below: \n");
//        String newSent = scanner.nextLine();
//        System.out.printf("You wrote: %s\n",newSent);

// CALCULATE THE PERIMETER
//     Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//
//Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.


//        System.out.println("Enter room length: ");
//        String roomLength = scanner.nextLine();
//        System.out.println("Enter room width: ");
//        String roomWidth = scanner.nextLine();
//        int calculate = Integer.parseInt(roomWidth) * Integer.parseInt(roomLength);

//        int calculate = (Integer.parseInt(roomWidth) * 2) + (Integer.parseInt(roomLength) * 2);
//
//
//
//        System.out.printf("Your measurement is: %s",calculate);
    }
}
