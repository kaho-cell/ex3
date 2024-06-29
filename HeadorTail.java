import java.util.Random;

public class HeadorTail{
    public static void main(String[] args){
        System.out.println("Tossing a coin...");
        Random random = new Random();
        int rand[] = {0, 0};
        for(int i=0; i<3; i++){
            int randomValue = random.nextInt(2);
            if(randomValue == 0){
                rand[0]++;
                System.out.println("Round " + i + ": Heads");
            }
            else{
                rand[1]++;
                System.out.println("Round " + i + ": Tails");
            }
        }
        System.out.println("Heads: " + rand[0]+ ", Tails: " + rand[1]);
        if (rand[0]>rand[1]){
            System.out.println("You won");
        }
        else{
            System.out.println("You lost");
        }
    }
}
