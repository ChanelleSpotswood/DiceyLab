
import java.util.Random;

public class Dice {

    public Integer toss(){
        Random rand = new Random();

        int num = rand.nextInt(6);

        num += 1;

        return  num;
    }

}
// Add 1 to the result to get a number from the required range

