import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteName {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("Logan");
        name.add("Shiva");
        name.add("Dheeraj");
        name.add("Khushi");

        try {
            PrintWriter pw=new PrintWriter("Name.txt");
           for(String nam: name)
               pw.println(nam);
           pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Couldn't write names");
        }

    }
}
