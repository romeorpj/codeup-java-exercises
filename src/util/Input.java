package util;
import java.util.Scanner;
public class Input {
    private static final Scanner scanner = new Scanner(System.in);
    //   TODO: Properties
    //   TODO: Constructor
    //   TODO: Getter & Setters
    //   TODO: Custom Methods
    public static String getString (String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public static boolean yesNo (String prompt) {
        System.out.println(prompt);
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
    public static int getInt(int min, int max) {
        System.out.printf("Enter a number between %s and %s",min,max);
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }
//    public static int getInt(int prompt) {
//        System.out.println(prompt);
//        return scanner.nextInt();
//    }
    public static double getDouble(double min, double max) {
        System.out.printf("Enter a number between %s and %s",min,max);
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

 }

