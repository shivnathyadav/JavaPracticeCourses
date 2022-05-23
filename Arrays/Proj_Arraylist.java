import java.util.ArrayList;
import java.util.Scanner;

public class Proj_Arraylist {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enetr number equal or gretaer than 0 or for exit enter -1");

        ArrayList<Double> myArray = new ArrayList<>();

        double input;
        input = sc.nextDouble();

        while(input>=0){
            myArray.add(input);

            System.out.println("Enetr number equal or gretaer than 0 and to exit enter -1");

            input = sc.nextDouble();


        }
        for (int i=0;i< myArray.size();i++){
            System.out.println(myArray.get(i));
        }

    }
}
