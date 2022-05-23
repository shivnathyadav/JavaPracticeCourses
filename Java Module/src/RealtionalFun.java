import java.sql.SQLOutput;

public class RealtionalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobAge = 20;

        System.out.println("myBool is "+myBool);
        System.out.println("yourBool is "+yourBool);



        String myName="Shiva";
        String yourName= "Shiva";


        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > bobAge;
        System.out.println(" yourAge > bobAge ? :"+ ageComparison);

        ageComparison = yourAge == bobAge;
        System.out.println("yourAge == bobAge ? :"+ ageComparison);

        System.out.println("does name matches ?: " +  (myName==yourName));
    }
}
