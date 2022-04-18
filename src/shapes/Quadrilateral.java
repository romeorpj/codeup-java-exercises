package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected int width;
//    public abstract void setLength();
//    public abstract void setWidth();

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
