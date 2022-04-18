package shapes;

public class Square extends Quadrilateral{

    public Square(int width){
        super(width,width);
    }

    @Override
    public double getPerimeter(){
        return Math.pow(super.width,2);
    }

    @Override
    public double getArea(){
        return (super.width*2);
    }


}
