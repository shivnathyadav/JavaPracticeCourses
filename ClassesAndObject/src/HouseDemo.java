public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House();

        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("red");

//        yourHouse.setNumStories(8);
//        yourHouse.setNumWindows(20);
//        yourHouse.setColor("Blue");

        System.out.println("myhouse stories"+ myHouse.getNumStories() +"my house "+myHouse.getNumWindows()+ " windows"+ "  my house is in "+myHouse.getColor()+ "color");

        System.out.println("yourhouse stories"+ yourHouse.getNumStories() +"your house "+yourHouse.getNumWindows()+ " windows"+ "  your house is in "+yourHouse.getColor()+ "color");


    }
}
