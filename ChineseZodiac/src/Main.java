import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birth = inp.nextInt();
        int mod= birth%12;
        String zodiac="";
        switch (mod){
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac= "Rooster";
                break;
            case 2:
                zodiac= "Dog";
                break;
            case 3:
                zodiac= "Pig";
                break;
            case 4:
                zodiac= "Mice";
                break;
            case 5:
                zodiac= "Ox";
                break;
            case 6:
                zodiac= "Tiger";
                break;
            case 7:
                zodiac= "Rabbit";
                break;
            case 8:
                zodiac= "Dragon";
                break;
            case 9:
                zodiac= "Snake";
                break;
            case 10:
                zodiac= "Horse";
                break;
            case 11:
                zodiac= "Sheep";
                break;
            default:
                System.out.println("Something went wrong.");

        }
        System.out.println("Your Chinese Zodiac Sign: "+zodiac);
    }
}
