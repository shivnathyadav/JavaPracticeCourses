import java.util.ArrayList;
import java.util.Scanner;

public class Proj_arrayAndArraylist {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        ArrayList<String > name =new ArrayList<>();
        ArrayList<Integer> age =new ArrayList<>();

        for(int i=0;i<5;i++){
            System.out.println("Enter name");
            String names=Sc.nextLine();
            name.add(names);

            System.out.println("Enter Age");
            int ages =Sc.nextInt();
            age.add(ages);
            Sc.nextLine();
        }

        for(int i=0;i< name.size();i++){
            System.out.println(name.get(i)+ " is "+age.get(i)+" years old ");

        }

    }
}
