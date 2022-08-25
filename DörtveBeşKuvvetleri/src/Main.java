import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n= inp.nextInt();
        System.out.println("Power of 4 : " );
        for (int i = 1; i <= n; i*=4){
            System.out.print(i+" ");
        }
        System.out.println("");

        System.out.println("Power of 5 : " );
        for (int i = 1; i <= n; i*=5){
            System.out.print(i+" ");
        }
    }
}
