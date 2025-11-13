import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char menu = 'y';
        
        do { 
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            
            do { 
                System.out.print("Guess the number (1-10): ");
                int answer = sc.nextInt();
                success = (answer == number);

                if (answer == number) {
                    System.out.println("Correct!");
                    success = true;
                } else if (answer < number) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

            } while (!success);
            System.out.print("Do you want to repeat the game (Y/N) ");
            menu = sc.next() .charAt(0);
            sc.nextLine();

        } while (menu == 'Y' || menu == 'y');
        System.out.println("Thanks for playing!");
    }
}