import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Rectangle {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleList;
        rectangleList =new ArrayList<>();

        fillArrayList(rectangleList);
        printRectangles(rectangleList);

    }
    public static void fillArrayList(ArrayList<Rectangle> rectangleAl){
        Scanner infile;

        try{
            infile = new Scanner(new File("rectangle_data.txt"));
            Rectangle temp;
            double length;
            double width;

            while(infile.hasNext()){
                length = infile.nextDouble();
                width = infile.nextDouble();
                temp = new Rectangle(length,width);
                rectangleAl.add(temp);
            }
            infile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Error accessing file");
        }
    }
    public static void printRectangles(ArrayList<Rectangle> rectangleAI){
        for (Rectangle r: rectangleAI){
            System.out.println("Length: "+r.getLength()+ "  Width: "+r.getWidth());
            System.out.println("Area of Rectangle: "+r.area());
            System.out.println("Perimeter of Rectangle: "+ r.perimeter());
            System.out.println();
        }
    }
}
