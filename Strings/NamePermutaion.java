import java.util.ArrayList;
import java.util.Scanner;

public class NamePermutaion {
    public static void main(String[] args) {
        Scanner names=new Scanner(System.in);

        ArrayList<String> fullName=new ArrayList<>();
        ArrayList<String > firstName=new ArrayList<>();
        ArrayList<String > lastName=new ArrayList<>();

        String fullNames;
        String firstNames;
        String lastNames;
        int indexofSpace;
        for(int i=0;i<5;i++){
            fullNames = names.nextLine();
            indexofSpace= fullNames.indexOf(" ");
            firstName.add(fullNames.substring(0,indexofSpace));
            lastName.add(fullNames.substring(indexofSpace+1));

        }

        for (int i=0;i<firstName.size();i++){
            for(int j=0;j<lastName.size();j++){
                System.out.println(firstName.get(i)+ " " +lastName.get(j));
            }
               }


    }
}
