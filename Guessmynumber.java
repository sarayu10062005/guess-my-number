import java.util.Random;
import java.util.Scanner; 
public class Guessmynumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
      
        int user = 0;
        int Guess = random.nextInt(10);
        while (user!=Guess) {
            System.out.println("Enter your guess: ");
            user = sc.nextInt();
            if(user<Guess){
                System.out.println("your guess is greater than actual guess");
            }
            else if(user>Guess){
                System.out.println("your guess is less than actual guess");
            }
            else{
                System.out.println("YOU WON!!!");
       }
} 

} 
}