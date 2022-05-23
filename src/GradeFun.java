import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;

        System.out.println("Enetr the Grade");
        grade = sc.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Great job");
                break;
            case 'B':
                System.out.println("Good Job");
                break;
            case 'C':
                System.out.println("Satisfactory");
                break;

            case 'D':
                System.out.println("Just pass");
                break;
            case 'E':
                System.out.println("Failed");
            default:
                System.out.println("INvalid Grade");

        }



    }
}
