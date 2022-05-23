import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Circle {

    public static void main(String[] args) {
        ArrayList<Circle> circl=new ArrayList<>();

        fillArrayList(circl);
        printCircleList(circl);

    }
    public static void fillArrayList(ArrayList<Circle> circle){
        Scanner infile;

        try{
            infile = new Scanner(new File("circle_data.txt"));
            Circle temp;
            double radius;

            while(infile.hasNext()){
                radius = infile.nextDouble();
                temp =new Circle(radius);
                circle.add(temp);
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("Error Access file !!");
        }


    }
    public static void printCircleList(ArrayList<Circle> circle){
        PrintWriter pw;
        try {
            pw = new PrintWriter("circle_output.txt");
            for(Circle cir:circle) {
                System.out.println("Radius: " + cir.getRadius());
                System.out.println("Area: " + cir.circumference());
                System.out.println("Circumference: " + cir.circumference());
                System.out.println();

                pw.println("Radius: " + cir.getRadius());
                pw.println("Area: " + cir.circumference());
                pw.println("Circumference: " + cir.circumference());
                pw.println();
            }
            pw.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Couldn't access file");
        }

    }

}
