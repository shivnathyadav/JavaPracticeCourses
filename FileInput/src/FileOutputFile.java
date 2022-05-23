import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFile {
    public static void main(String[] args) {
        try{
            PrintWriter PW =new PrintWriter("output.txt");
            //System.out.println();
            PW.println("Hello there");
            PW.println("My name is Shivaji");
            PW.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Couldn't write to the file");

        }

    }
}
