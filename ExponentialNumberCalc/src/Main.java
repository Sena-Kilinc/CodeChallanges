import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,total=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        a = inp.nextInt();
        System.out.print("Enter the power to be taken: ");
        b = inp.nextInt();
        for (int i=1;i<=b;i++){
            total *=a;
        }
        System.out.println("Result: "+total);

    }
}
