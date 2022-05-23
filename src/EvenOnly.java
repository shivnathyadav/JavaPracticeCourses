import java.util.Scanner;

public class EvenOnly {
    public static void main(String[] args) {
        int count =0;
        while(count < 10){

            if(count%2!=0) {
                count += 1;
                continue;
            }
            System.out.println(count);
            count++;
        }

    }
}
