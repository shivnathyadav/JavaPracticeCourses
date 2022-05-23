import java.util.ArrayList;

public class Icecream {
    private String name;
    private int cost;
    private int numScoop;
    private ArrayList<String> toppings;

    public Icecream(String name,int cost,int numScoop){
        this.name=name;
        this.cost=cost;
        this.numScoop=numScoop;
        this.toppings =new ArrayList<>();

    }

    public int getCost() {
        return cost;
    }

    public int getNumScoop() {
        return numScoop;
    }

    public String getName() {
        return name;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }
    public void printToppings(){
        for( String topping: toppings){
            System.out.println(topping);
        }
    }
}
