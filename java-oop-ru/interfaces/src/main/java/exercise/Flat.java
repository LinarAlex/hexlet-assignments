package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private  double balconyArea;
    private  int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getRoomArea() {
        return area;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    public  int getFloor() {
        return floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + getFloor() + " этаже";
    }

     @Override
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
