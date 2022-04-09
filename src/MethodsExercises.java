import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Random rand = new Random();

//        System.out.println(addNum(1,2));
//        System.out.println(subNum(10,5));
//        System.out.println(mulNum(20,2));
//        System.out.println(divNum(10,5));
////        System.out.println(divNum(0,0));
//        System.out.println(modNum(10,6));
//System.out.println(getInteger(1, 10));
//        System.out.println(factorial(6));
        nDiceRolls();


    }

//    Question1
//    public static int addNum(int a1,int a2) {return a1 + a2;}
//    public static int subNum(int s1,int s2) {return s1 - s2;}
//    public static int mulNum(int m1,int m2) {return m1 * m2;}
//    public static int divNum(int d1,int d2) {return d1 / d2;}
//    public static int modNum(int mod1,int mod2) {return mod1 % mod2;}

//    Question2
//static int userInput = getInteger(1, 10);
//    public static int getInteger(int min, int max){
//        System.out.print("Enter a number between 1 and 10:");
//        int inputNum = new Scanner(System.in).nextInt();
//       if(inputNum <= max && inputNum >= min){
//           System.out.print("you are validated");
//       } else if(inputNum > max && inputNum < min){
//           getInteger(min, max);
//       }
//        return getInteger(1, 10);
//    }

    //    Question3

//    static int factorial(int n)
//    {
//        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
//}

//Question4
public static void nDiceRolls(){
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.println("Do you want to roll the dice? y/n");
    String wannaPlay = sc.next();
    int diceSidesInput = 0;
    int dice1 = 1;
    int dice2 = 1;
    if(wannaPlay.equals("y")){
        System.out.println("Enter number of sides on each dice");
       diceSidesInput = sc.nextInt();
        dice1 += rand.nextInt(diceSidesInput);
        dice2 += rand.nextInt(diceSidesInput);
    }else if (wannaPlay.equals("n")){
        System.out.println("GOODBYE!");
    }
    System.out.printf("Both die have %s sides: Dice 1 rolled a %s. And Dice 2 rolled a %s",diceSidesInput,dice1,dice2);

}

}
