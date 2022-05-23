public class MethodOverloading {
    public static void main(String[] args) {
        int result= getResult(25);
        System.out.println(result);

        result =getResult(20,25);
        System.out.println(result);

        result =getResult(25,"10");
        System.out.println(result);

        System.out.println(concat("shiv","yadav"));

    }

    public static int getResult(int num){
        return num*num;
    }
    public static int getResult(int num1,int num2){
        return num1*num2;
    }
    public static int getResult(int num1, String value){
        return num1 *Integer.parseInt(value);
    }
    public static String concat(String str1,String str2){
        return str1+" "+str2;
    }
}
