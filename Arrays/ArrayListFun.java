import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> nameList =new ArrayList<>();

        nameList.add("Shiva");
        nameList.add("Anil");
        nameList.add("Dheraj");
        nameList.add("Syed");
        nameList.add("Samhitha");

        for (int i=0;i< nameList.size();i++){
            System.out.println(nameList.get(i));
        }

        for(String name : nameList){
            System.out.println(name);
        }


    }
}
