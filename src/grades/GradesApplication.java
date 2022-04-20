package grades;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication<students> {
    static HashMap<String, String> students = new HashMap<String, String>();
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

        students.put("kevinGittyBoi", s1.getName());
        students.put("andreGittyBoi", s2.getName());
        students.put("tomGittyBoi", s3.getName());
        students.put("JohnGittyBoi", s4.getName());



//        System.out.println(students.get("kevinGittyBoi"));
//        System.out.println(students.get("kevinGittyBoi")+"'s" + " GPA is "+s2.getGradeAverage());
//        System.out.println(students);
//
//        System.out.println("type a user name");
//        String test = sc.nextLine();
//        System.out.println(students.get(test));

    System.out.println("Welcome!");
    System.out.println("Here are the GitHub usernames of our students:");
    System.out.println(students.keySet());
    System.out.println("What student would you like to see more information on?");
    String userInput = sc.nextLine();

    if(students.containsKey(userInput)){
        System.out.println("Name: " + students.get(userInput) + " - GitHub Username: " + userInput);

        switch (userInput) {
            case "kevinGittyBoi":
                s1.getGradeAverage();
                break;
            case "andreGittyBoi":
                s2.getGradeAverage();
                break;
            case "tomGittyBoi":
                s3.getGradeAverage();
                break;
            case "JohnGittyBoi":
                s4.getGradeAverage();
                break;
        }

//        for(int i = 0;i <= students.size()-1;i++){
//            System.out.println();
//        }
//        System.out.println("Current Average: " + );
    }





    if (!students.containsKey(userInput)) {
        System.out.println("Sorry, no student found with the GitHub username of " + userInput +".");
        System.out.println("Would you like to see another student, y/n?");
        String yesOrNo = sc.nextLine();
if(yesOrNo.equalsIgnoreCase("y")){
    System.out.println("Name: " + students.get("kevinGittyBoi") + " - GitHub Username: " + userInput);
//    System.out.println("Current Average: " + );
}
    }else{
        System.out.println("Goodbye");
    }




    }

public void getGithubNames(){
        for (int i = 0; i<= students.size()-1;i++){

        }
}

}
