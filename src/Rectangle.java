public class Rectangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Rectangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Rectangle() {

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

    public Point getPointC() {

        return pointC;
    }

    public void setPointC(Point pointC) {

        this.pointC = pointC;
    }

    public double sideLengthAB() {
        double side = 0;
        if (this.pointA.getX() == this.pointB.getX()) {
            side = this.pointA.getY() - this.pointB.getY();
        } else {
            side = this.pointA.getX() - this.pointB.getX();
        }
        return side;
    }

    public double sideLengthAC() {
        double side = 0;
        if (this.pointA.getX() == this.pointC.getX()) {
            side = this.pointA.getY() - this.pointC.getY();
        } else {
            side = this.pointA.getX() - this.pointC.getX();
        }
        return side;
    }

    @Override
    public double getPerimetr() {
        double sideLengthAC = (sideLengthAC() < 0) ? sideLengthAC() * (-1) : sideLengthAC();
        double sideLengthAB = (sideLengthAB() < 0) ? sideLengthAB() * (-1) : sideLengthAB();
        return 2 * (sideLengthAC + sideLengthAB);
    }

    @Override
    public double getArea() {
        double area = sideLengthAC() * sideLengthAB();
        double areaRezult = (area < 0) ? area * (-1) : area;
        return areaRezult;
    }

    @Override
    public String toString() {
        return this.getClass().toString();
    }
}
