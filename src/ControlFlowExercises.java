import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//a. While
//
//Create an integer variable i with a value of 5.
//Create a while loop that runs so long as i is less than or equal to 15
//Each loop iteration, output the current value of i, then increment i by one.
//Your output should look like this:
//
//5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

//        b. Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        6553
//        Count by 2
//        int j = 0;
//do {
//    System.out.println(j);
//   j += 2;
//}
//while (j <= 100);

//        Count backwards by 5
//        int x = 100;
//        do {
//            System.out.println(x);
//            x -= 5;
//        }
//        while (x >= -10);
//    }
//    //        TODO numbers squared
//    long y = 2;
//        do {
//        System.out.println(y);
//            y *= y;
//    }
//        while (y <= 1000000);
////
//        for (int x = 100; x >= 100 ; x-=5) {
//            System.out.println(x);
//        }
//        for (long y = 2L; y <= 1000000L ; y *= y) {
//            System.out.println(y);
//        }
//        FIZZBUZZ
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//Write a program that prints the numbers from 1 to 100.
//For multiples of three: print “Fizz” instead of the number.
//For the multiples of five: print “Buzz”.
//For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//              System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }

//Display a table of powers.
//
//Prompt the user to enter an integer.
//Display a table of squares and cubes from 1 to the value entered.
//Ask if the user wants to continue.
//Assume that the user will enter valid data.
//Only continue if the user agrees to.
//Example Output
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125


        boolean runItAgain = true;
        do {
            System.out.println("What number would you like to go up to? ");
            String promptInt = scanner.next();
            System.out.println("Ok! Here is your table.");
            System.out.println("number | squared | cubed\n------ | ------- | -----");
            for (int i = 1; i <= parseInt(promptInt) ; i++) {
                int squared = i * i;
                int cubed = i * i * i;
                System.out.printf("%s      | %s       | %s\n",i,squared,cubed);
            }
            System.out.println("Would you like to try again y or n? ");
            String tryAgain = scanner.next();
            if(Objects.equals(tryAgain, "n")){
                runItAgain = false;
            }
        }while(runItAgain != false);




//        Convert number to letter grade
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
        System.out.println("Enter your grade value from 0 - 100");
        String gradePrompt = scanner.next();

        if(parseInt(gradePrompt) >= 88){
            System.out.println("You've earned an A!");
        }else if(parseInt(gradePrompt) >= 80 && parseInt(gradePrompt) <= 87){
            System.out.println("You've earned a B!");
        }else if(parseInt(gradePrompt) >= 67 && parseInt(gradePrompt) <= 79){
            System.out.println("You've earned a C!");
        }else if(parseInt(gradePrompt) >= 60 && parseInt(gradePrompt) <= 66){
            System.out.println("You've earned a D!");
        }else if(parseInt(gradePrompt) >= 0 && parseInt(gradePrompt) <= 59){
            System.out.println("You've earned a F!");
        }

}
}
