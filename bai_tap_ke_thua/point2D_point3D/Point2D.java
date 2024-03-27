package point2D_point3D;

public class Point2D {
    private Float x, y;

    public Point2D(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public  Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y =y;
    }

    public float[] getXY() {
        return new float[] {x, y};
    }

    @Override
    public String toString() {
        return "point2D_point3D.Point2D{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
