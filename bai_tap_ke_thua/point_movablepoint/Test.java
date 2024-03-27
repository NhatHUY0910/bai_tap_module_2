package point_movablepoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(3.3f, 4.6f);
        System.out.println("Giá trị ban đầu của Point x và y lần lượt là: " + point.getX() + ", " + point.getY());

        System.out.println();
        point.setX(3.9f);
        point.setY(4.5f);
        System.out.println("Giá trị của Point sau khi được set lại là: " + point);

        System.out.println();
        MovablePoint movablePoint = new MovablePoint(4.2f, 3.1f, 6.5f, 5.7f);
        System.out.println("Movable x và y là:  " + movablePoint.getX() + ", " + movablePoint.getY() + " và speed của x là: " + movablePoint.getxSpeed() + ", speed của y là: " + movablePoint.getySpeed());

        System.out.println();
        movablePoint.setxSpeed(9.6f);
        movablePoint.setySpeed(8.9f);
        System.out.println("Speed sau khi được set lại là: " + movablePoint.getxSpeed() + ", " + movablePoint.getySpeed());

        System.out.println();
        movablePoint.move();
        System.out.println("Sau khi move sang vị trí mới: " + movablePoint.getX() + ", " + movablePoint.getY());
    }
}
