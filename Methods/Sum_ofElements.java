import java.util.ArrayList;
import java.util.Scanner;

public class Sum_ofElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        int res=sumElement(arr);
        System.out.println("sum of elements " +res);


    }
    public static int sumElement(ArrayList<Integer> arr){
        int sum=0;
        for(int i=0;i< arr.size();i++){
            sum+= arr.get(i);
        }
        return sum;
    }
}
