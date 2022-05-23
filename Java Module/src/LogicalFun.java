public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;

        boolean combined = isRaining && isWarm ;
        System.out.println(" is it raining and warmc? "+ combined);

        combined = isRaining || isWarm ;

        System.out.println(" is it raining or warm ?: "+ combined);

        combined = !isRaining;

        System.out.println(" is raining? "+ combined);


    }
}
