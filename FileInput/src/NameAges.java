import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class NameAges {
    public static void main(String[] args) {

        Scanner nameFile;
        Scanner ageFile;
        PrintWriter pw;

        try{
            nameFile =new Scanner(new File("student_names"));
            ageFile = new Scanner((new File("student_ages")));
            pw=new PrintWriter("name_ages.txt");

            String tempName;
            int tempAge;

            while(nameFile.hasNext()){
                tempName=nameFile.nextLine();
                tempAge=ageFile.nextInt();

                pw.println(tempName+ " is "+tempAge+"  years old ");

            }

            nameFile.close();
            ageFile.close();
            pw.close();



        }
        catch (FileNotFoundException ex){
            System.out.println("Can not find file");
        }




    }
}
