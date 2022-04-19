package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    //    main method
    public static void main(String[] args) {
        Student student1 = new Student("Richard");
        student1.addGrade(100);
        student1.addGrade(50);
        System.out.println(student1.getGradeAverage());

    }


    //    Private properties
    private  String name;
//    private ArrayList<Integer> grades = new ArrayList<>();
    private  ArrayList<Integer> grades;


    //    Student constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    //    Student methods
    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public int getGradeAverage() {
        int gradeAdder = 0;
        for (int i = 0; i <= grades.size() -1; i++) {
            gradeAdder += grades.get(i);
        }
        return gradeAdder / grades.size();
    }


}
