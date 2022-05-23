public class RectangleDemo {
    public static void main(String[] args) {
    Rectangle r1 =new Rectangle();
    Rectangle r2 =new Rectangle(5,10);

        System.out.println(Rectangle.getNumrectangles());

        Rectangle r3;

        System.out.println(Rectangle.getNumrectangles());

        System.out.println(r1.area());
        System.out.println(r2.area());

    }
}
