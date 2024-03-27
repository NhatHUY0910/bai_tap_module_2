public class Main {
    public static void main(String[] args) {
//        Demo demo1 = new Demo();
//        demo1.b = 5;
//        Demo demo2 = new Demo();
//        demo2.b = 5;
//        Demo demo3 = new Demo();
//        demo3.b = 5;
        Demo.a = 5;
        Demo.a = 6;
        Demo demo4 =  new Demo();
        Demo demo5 =  new Demo();
        System.out.println( Demo.getA());;
    }
}


