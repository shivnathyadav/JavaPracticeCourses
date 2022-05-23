public class IceCreamDemo {
    public static void main(String[] args) {
        Icecream myIC = new Icecream("Chocolate",3,5);
        Icecream yourIC = new Icecream("Strawberry",10,2);

        myIC.addTopping("nuts");
        myIC.addTopping("Cherries");

        yourIC.addTopping("Springles");

        printIC(myIC);
        printIC(yourIC);
    }
    public static void printIC(Icecream icecream){
        System.out.println(icecream.getName());
        System.out.println("Cost "+ icecream.getCost());
        icecream.printToppings();
        System.out.println();
    }
}
