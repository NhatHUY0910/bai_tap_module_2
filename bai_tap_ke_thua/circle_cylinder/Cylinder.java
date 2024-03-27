package circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }

    @Override
    public String toString() {
        return "circle_va_cylinder.Cylinder{" +
                "height = " + height +
                ", radius = " + getColor() +
                ", area = " + calculateArea() +
                ", volume = " + calculateVolume() +
                '}';
    }
}
