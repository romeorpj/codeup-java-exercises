import java.util.*;

public class ServerNameGenerator {
//    static Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    static Random numGenerator = new Random(); // create a usable instance of the random class


    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    static String[] adjectives = {"Romantic", "Proficient","Nice","Faithful","Courageous", "Perfect","Stunning","Lovely",
            "Brilliant","Elegant"};
   static String[] nouns = {"Hamburger","Actor","Bed","Jelly","Shoe","Lighter","Crayon","Car","Horse","Oyster"};

    //    Create a method that will return a random element from an array of strings.


    public static String newWord(String[] scInput){
        int randNum = numGenerator.nextInt(scInput.length);
        return scInput[randNum];
    }


    public static void main(String[] args) {
        System.out.println("Your random adjective is: " + newWord(adjectives));
        System.out.println("Your random noun is: " + newWord(nouns));
    }





}
