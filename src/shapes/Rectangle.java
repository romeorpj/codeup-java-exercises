package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//    public double getArea(){
//        return length * width;
//    }
//    public double getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
}
