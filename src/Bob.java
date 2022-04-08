
import java.util.Objects;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String continueWithBobby;
        do {
            System.out.println("Talk to Bobby... ");
            String talkToBobby = sc.nextLine();

            if (talkToBobby.endsWith("?")) {
                System.out.println("Sure.");
            } else if (talkToBobby.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (talkToBobby.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("would you like to continue talking to Bobby? y/n:");
            continueWithBobby = sc.nextLine();
            if(Objects.equals(continueWithBobby, "n")){
                break;
            }else if(!continueWithBobby.equals("y") && !continueWithBobby.equals("n")){
                System.out.println("You didn't follow instructions, you know what, I'm leaving!!! bye...");
                break;
            }
        } while (Objects.equals(continueWithBobby,"y"));


    }
}
