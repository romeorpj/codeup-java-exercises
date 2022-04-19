package movies;

import java.util.Arrays;
import java.util.Scanner;

import static movies.MoviesArray.findAll;


public class MoviesApplication {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(findAll()));

        System.out.println("What would you like to do? ");
        int userInput = sc.nextInt();


    }
}
