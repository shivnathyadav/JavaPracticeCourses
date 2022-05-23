public class StringFun {
    public static void main(String[] args) {
        String name = "Logan Paul";
        String name3= "Shiv Nath";
        String name2= "Logan Paul";

        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        System.out.println();

        if(name.equals(name2)){
            System.out.println("name are equl");
        }
        else{
            System.out.println("names are not equal");
        }

        if(name.compareTo(name3)>0){
            System.out.println("name > name3");

        }
        else{
            System.out.println("name <= name3");
        }

        String myName= "Shiv_Name";

        if(myName.compareTo(name)>0){
            System.out.println("my name > name");
        }
        else{
            System.out.println("my name < name");
        }


    }
}
