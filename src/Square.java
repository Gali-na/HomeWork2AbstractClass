public class Square extends Shape {
    private Point pointA;
    private Point pointB;

    public Square(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Square() {

    }

    public Point getPointA() {

        return pointA;
    }

    public void setPointA(Point pointA) {

        this.pointA = pointA;
    }

    public Point getPointB() {

        return pointB;
    }

    public void setPointB(Point pointB) {

        this.pointB = pointB;
    }

    public double sideLength() {
        double side =0;
        if (this.pointA.getX()==this.pointB.getX())
        {
            side= this.pointA.getY()-this.pointB.getY();
        }
        else {
            side= this.pointA.getX()-this.pointB.getX();
        }
        return side;
    }

    @Override
    public double getPerimetr() {

        return 4*(sideLength());
    }

    @Override
    public double getArea() {

        return sideLength()*sideLength();
    }

    @Override
    public String toString() {

        return this.getClass().toString();
    }
}
