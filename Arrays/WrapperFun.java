import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAl=new ArrayList<>();

        myAl.add(new Integer(10));
        myAl.add(new Integer(20));
        myAl.add(30);


        for(int i=0;i< myAl.size();i++){
            System.out.println(myAl.get(i));
        }

        String someValue="450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;

        System.out.println(numericValue);


    }
}
