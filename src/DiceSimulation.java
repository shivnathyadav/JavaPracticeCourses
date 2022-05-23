import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();

        int diceValue;

        for(int i=0;i<10;i++){
            diceValue =random.nextInt(6);
            System.out.println(diceValue+1);

        }

    }
}
