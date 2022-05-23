import java.util.Scanner;

public class LearningPackages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int package1 = 6;
        int package2 = 4;
        int package3 =3;
        int pack;
        int courses;

        System.out.println("Enter the package2 from which you courses");
        pack = sc.nextInt();

        System.out.println("Enetr the number of courses");
        courses = sc.nextInt();

        if(pack == 1){
            System.out.println("total cost "+package1*courses);
        }
        else if(pack == 2){
            System.out.println("total cost "+ package2*courses);
        }
        else if(pack == 3)
        {
            System.out.println("totak cost "+ package3*courses);
        }




    }
}
