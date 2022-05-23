import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;


        try {
            infile = new Scanner((new File("Input.txt")));
            int input;
            int sum=0;
            while(infile.hasNext()){
                input = infile.nextInt();
                sum+=input;
                System.out.println(input);
            }//end while
            System.out.println(" the sum is "+sum);
           infile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Cann't find file");
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("error reading input");

        }

    }
}
