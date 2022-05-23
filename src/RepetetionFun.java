import java.util.Scanner;

public class RepetetionFun {
    public static void main(String[] args) {
        int count=10;
        Scanner sc = new Scanner(System.in);
//
//        while(count<10){
//            System.out.println(count);
//            count++;
//        }//end while

//       do {
//            System.out.println(count);
//            count++;
//        }while(count<10);
//

//
//       for(int i=0;i<count;i++){
//            System.out.println(i);
//        }//end for
//
        int input = sc.nextInt();
        int sum=0;

        while(input >=0){
            sum+=input;
            input = sc.nextInt();
        }
            System.out.println(sum);




    }
}
