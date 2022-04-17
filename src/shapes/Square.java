package shapes;

public class Square extends Rectangle{

    public Square(int side){

        super(side, side);
    }

    @Override
    public double getPerimeter(){
        return this.width * 4;
    }

    @Override
    public double getArea(){
        return (int) Math.pow(this.length, 2);
    }
}
