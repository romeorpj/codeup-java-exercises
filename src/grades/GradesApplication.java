package grades;

import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication<students> {
    static HashMap<String, Student> students = new HashMap<String, Student>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student("Kevin");
        s1.addGrade(80);
        s1.addGrade(60);
        s1.addGrade(100);
        Student s2 = new Student("Andre");
        s2.addGrade(35);
        s2.addGrade(98);
        s2.addGrade(60);
        Student s3 = new Student("Tom");
        s3.addGrade(100);
        s3.addGrade(90);
        s3.addGrade(100);
        Student s4 = new Student("John");
        s4.addGrade(2);
        s4.addGrade(10);
        s4.addGrade(25);

        students.put("kevinGittyBoi", s1);
        students.put("andreGittyBoi", s2);
        students.put("tomGittyBoi", s3);
        students.put("JohnGittyBoi", s4);

//        System.out.println(students.get("kevinGittyBoi").);
        boolean looper = true;
        System.out.println("Welcome!");


        do {
            System.out.println("Here are the GitHub usernames of our students:");
            System.out.println(students.keySet());
            System.out.println("What student would you like to see more information on?");
            String userInput = sc.next();

            if (students.containsKey(userInput)) {
                System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
                System.out.println("Current Average: " + students.get(userInput).getGradeAverage());

            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput + ".");
                System.out.println("Would you like to see another student, y/n?");
                String yesOrNo = sc.nextLine();
                if (yesOrNo.equalsIgnoreCase("n")) {
                    looper = false;
                    System.out.println("Goodbye, and have a wonderful day!");
                }
            }

        }while (looper) ;

    }
}
