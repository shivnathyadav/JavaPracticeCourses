public class CircleDemo {
    public static void main(String[] args) {
        Circle unit = new Circle();
        Circle myCircle =new Circle(2.5);
        Circle yourCircle =new Circle(10);

        printCircleData(unit);
        printCircleData(myCircle);
        printCircleData(yourCircle);

    }
    public static void printCircleData(Circle circle){
        System.out.println(" radius " +circle.getRadius());
        System.out.println(" area of circle "+ String.format("%.2f",circle.area()));
        System.out.println(("circumference of circle "+String.format("%.2f",circle.circumference())));

        System.out.println();
    }
}
