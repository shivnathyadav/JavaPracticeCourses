import java.util.Scanner;

public class KeyBoardInput {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String name;
        String address;

        System.out.println("What is your name:  ");
        name =keyboard.nextLine();

        System.out.println("What is your Age: ");
        int age =keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("where do you live: ");
        address = keyboard.nextLine();

        System.out.println("Hello "+ name);
        System.out.println("age : "+age);
        System.out.println("city : "+ address);


    }
}
