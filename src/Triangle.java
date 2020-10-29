public class Triangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle() {

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
        return (side < 0) ? side * (-1) : side;
    }

    public double sideLengthAC() {
        double side = 0;
        if (this.pointA.getX() == this.pointC.getX()) {
            side = this.pointA.getY() - this.pointC.getY();
        } else {
            side = this.pointA.getX() - this.pointC.getX();
        }
        return (side < 0) ? side * (-1) : side;
    }

    public double sideLengthCB() {
        double side = 0;
        if (this.pointB.getX() == this.pointC.getX()) {
            side = this.pointB.getY() - this.pointC.getY();
        } else {
            side = this.pointB.getX() - this.pointC.getX();
        }
        return (side < 0) ? side * (-1) : side;
    }

    @Override
    public double getPerimetr() {

        return sideLengthAB()+sideLengthAC()+sideLengthCB();
    }

    @Override
    public double getArea() {
        return  Math.sqrt(getPerimetr()*((getPerimetr()-sideLengthCB())*(getPerimetr()-sideLengthAB())
                *((getPerimetr()-sideLengthAC()))));
    }

    @Override
    public String toString() {

        return this.getClass().toString();
    }
}

