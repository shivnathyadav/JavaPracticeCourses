import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] array=new int[5];
        for(int i=0;i<array.length;i++){
            int num = sc.nextInt();
            array[i]=num;
            array[i]  *=2;

        }

        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }




    }
}
