public class MethodCalls {
    public static void main(String[] args) {
        doSomething();
    }
    public static void doSomething(){
        System.out.println("In do Somwthing");

        int result = getSomevalue();

        System.out.println("result: "+result);

    }
    public static int getSomevalue(){
        return 150;
    }
}
