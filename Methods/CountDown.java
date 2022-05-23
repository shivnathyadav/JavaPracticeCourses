public class CountDown {
    public static void main(String[] args) {
        countDownFrom(10);
        countupto(3,12);
    }
    public static void countDownFrom(int num){
        if(num>=0){
            System.out.println(num);
            countDownFrom(num-1);
        }
    }
    public static void countupto(int from,int to){
        if(from<=to){
            System.out.println(from);
            countupto(from+1,to);
        }
    }
}
