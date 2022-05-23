import java.util.Random;

public class Two2dArrays {
    public static void main(String[] args) {
     int[][] twoArray = new int[2][3];
     fill2d(twoArray);
     print2d(twoArray);
    }
    public static void fill2d(int[][] twoArr){
        Random random=new Random();
        for(int i=0;i< twoArr.length;i++){
            for(int j=0;j<twoArr[i].length;j++){
                twoArr[i][j]=random.nextInt(100)*2;
            }
        }
    }
    public  static void print2d(int[][] twoArr){
        for(int[] arr:twoArr){
            for(int num:arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
