package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }

    public int compareTo(Home another) {
        double anotherArea = another.getArea();
        if (anotherArea == getArea()) {
            return 0;
        }
        if (anotherArea > getArea()) {
            return -1;
        } else {
            return 1;
        }
    }
}
// END
