public class ArrayFun {
    public static void main(String[] args) {
        int [] myArray;
        myArray=new int[5];
        myArray[0]=10;
        myArray[1]=19;
        myArray[2]=15;
        myArray[3]=14;
        myArray[4]=13;

        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }// can give index out of bound error
        for(int num: myArray){
            System.out.println(num);
        }// not give index out bound

    }
}
