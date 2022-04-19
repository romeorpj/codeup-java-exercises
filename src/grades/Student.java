package grades;

import java.util.ArrayList;

public class Student {
    //    main method
    public void main(String[] args) {
        Student student1 = new Student("Richard");
        student1.addGrade(90);
        student1.addGrade(100);
        System.out.println(student1.getGradeAverage());
        System.out.println(student1);
    }


    //    Private properties
    private final String name;
//    private ArrayList<Integer> grades = new ArrayList<>();
    private final ArrayList<Integer> grades;


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
        for (int i = 0; i <= grades.size(); i++) {
            gradeAdder += grades.get(i);
        }
        return gradeAdder / grades.size();
    }


}
