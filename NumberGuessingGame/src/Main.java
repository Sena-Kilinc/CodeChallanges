import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int num= rand.nextInt(100); // (int)Math.random()*100
        Scanner scan = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrong=new int[5];
        boolean isWin = false;
        boolean isWrong =false;
        System.out.println(num);
        while (right<5){
            System.out.print("Please enter your guess: ");
            selected = scan.nextInt();

            if (selected<0 || selected>99){
                System.out.println("Please enter a number in the range of 0 to 100.");
                if (isWrong){
                    right++;
                    System.out.println("Too many false tries. Remaining rights: "+ (5-right));

                }else {
                    isWrong=true;
                    System.out.println("If you give any more false try your rights will be reduced.");
                }
                continue;
            }

            if (selected == num){
                System.out.println("Congrats, you guessed correctly!! The number was: "+num);
                isWin=true;
                break;
            }else {
                System.out.println("You guessed wrong.");
                if (selected>num){
                    System.out.println(selected+ " number is bigger than the secret number.");
                }else {
                    System.out.println(selected+" number is lower than the secret number");
                }
                wrong[right++] = selected;
                System.out.println("Your remaining rights: "+ (5-right));
            }
        }

        if (!isWin){
            System.out.println("You lose!");
            if (!isWrong){
                System.out.println("Your guesses: "+ Arrays.toString(wrong));
            }
        }
    }
}
