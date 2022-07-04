package rolladie;
import java.util.Random;
public class RollADie{
    public static void main(String[] args){
        // Simulate the roll of the die and print the result to the system
        Random r = new Random();
        int result = 0;
        for(int i = 0; i < 50; i++){
            result = r.nextInt(6); //Gives a result between 0 to 5
            result++;
            System.out.println("You rolled a "+result);
        }
        
    }
}