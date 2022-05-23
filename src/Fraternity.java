import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        char gender;

        System.out.println("Enetr your age");
        age= sc.nextInt();

        System.out.println("Enter your gender");
        gender = sc.next().charAt(0);

        if(age >=19 &&  gender== 'M'){

            System.out.println("you can enter fraternity");

        }
        else{
            System.out.println("Sorry you can join");
        }





    }
}
