import java.util.Objects;
import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you live in the city, Y or N?");
        String cityAns = scanner.next();
        System.out.println("Do you have transportation, Y or N?");
        String transportationAns = scanner.next();

        if(Objects.equals(cityAns, "Y") && Objects.equals(transportationAns, "Y") ||
                Objects.equals(cityAns, "y") && Objects.equals(transportationAns, "y")){
            System.out.print("Yes you can travel");
        }else{
            System.out.print("No you cannot travel");
        }
//         lives in city, has trans, if statement if they can travel or not


    }
}
