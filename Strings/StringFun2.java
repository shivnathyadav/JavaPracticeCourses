import java.util.Locale;
import java.util.Scanner;

public class StringFun2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String myName= "John Baugh";

        String upper =myName.toUpperCase();
        String lower =myName.toLowerCase();

        int whereisB =myName.indexOf("B");

        String lastName= myName.substring(5);

        System.out.println("upper is " + upper);
        System.out.println(" lower is "+ lower);
        System.out.println("B is at Index "+ whereisB);
        System.out.println("Last name is " + lastName);

        String realName=sc.nextLine();
        int indexspace = realName.indexOf(" ");
        String firstName= realName.substring(0,indexspace);

        String lastName1 =realName.substring((indexspace+1));

        System.out.println("first name is "+firstName);
        System.out.println("last name is "+ lastName1);

    }
}
