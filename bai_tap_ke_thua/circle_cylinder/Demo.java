package circle_cylinder;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(9, "Orange");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(12, "Blue", 7);
        System.out.println(cylinder.toString());
    }
}
