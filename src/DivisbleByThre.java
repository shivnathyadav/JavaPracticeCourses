import java.util.Scanner;

public class DivisbleByThre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the integer");
        int num = sc.nextInt();;

        if(num%3==0){
            System.out.println("Number is divisble by 3");
        }
        else{
            System.out.println("not divisble by 3");
        }

    }
}
