public class Demo {
    public static int a ;
    public int b;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Demo.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "b=" + b +
                '}';
    }
}
