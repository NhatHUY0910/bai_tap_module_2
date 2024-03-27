package point2D_point3D;

import point2D_point3D.Point2D;

public class Point3D extends Point2D {
    private float z;

    public Point3D(Float x, Float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] {getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return "point2D_point3D.Point3D{" +
                "x = " + getX() +
                ", y = " + getY() +
                ", z = " + z +
                '}';
    }
}
