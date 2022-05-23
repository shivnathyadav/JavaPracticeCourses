import java.util.Scanner;

public class MadLive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String adjective1;
        String girlsName;
        String adjective2;
        String occupation1;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;

        System.out.println("Enete adjective1");
        adjective1=sc.nextLine();

        System.out.println("ENter girls name:");
        girlsName = sc.nextLine();

        System.out.println(" Eneter adjecvtive 2");
        adjective2 = sc.nextLine();

        System.out.println(" Enter Occupation name");
        occupation1 = sc.nextLine();

        System.out.println(" Enter clothing");
        clothing = sc.nextLine();

        System.out.println("Enter hobby");
        hobby = sc.nextLine();

        System.out.println("Enter adjective");
        adjective3 = sc.nextLine();

        System.out.println("Enter occupation2");
        occupation2 = sc.nextLine();

        System.out.println("Enter Boy name");
        boysName = sc.nextLine();

        System.out.println(" Enter Man name");
        mansName = sc.nextLine();

        System.out.println("There once was a "+adjective1+" girl named "+girlsName+" who was a "+adjective2+""+occupation1+" in the kingdom of PLACE. She loved to wear "+clothing+" and to "+hobby +". She wanted to marry the "+adjective3+"."+occupation2+" named "+boysName+", but her father, king "+mansName+", forbid her from seeing him.");


    }
}
