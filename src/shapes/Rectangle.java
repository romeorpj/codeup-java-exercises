package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
public Rectangle(int length, int width){
    super(length, width);
}

    @Override
    public double getPerimeter() {
       return super.length * super.width;
    }

    @Override
    public double getArea() {
        return (super.length*2) + (super.width*2);
    }

//    @Override
//    public void setLength() {
//
//    }
//
//    @Override
//    public void setWidth() {
//
//    }


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
