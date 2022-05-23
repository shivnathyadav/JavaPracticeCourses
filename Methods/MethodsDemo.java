public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printnumber(25);

        int get10=giveme10();
        System.out.println(get10);

        int res=addTwo(10,50);
        System.out.println(res);
        double squareof=squared(2.5);
        System.out.println(squareof);

    }

    public static void printHello(){
        System.out.println("Hello  there");
    }

    public  static void printnumber(int a){
        System.out.println("the number is "+a);
    }

    public  static int giveme10(){
        return 10;
    }

    public static int addTwo(int num1,int num2){
       return num1+num2;
    }
    public static double squared(double num1){
        return num1*num1;
    }
}
