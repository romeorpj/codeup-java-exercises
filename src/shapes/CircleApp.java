package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        do {
            double userRadius = Input.getDouble("Enter the radius of your circle: ");
            Circle circle = new Circle(userRadius);
            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());
//            double userRadius = Input.getDouble("Now enter the width of your : ");
        } while (Input.yesNo("Would you like to make another circle?(y/n)"));
    }

}