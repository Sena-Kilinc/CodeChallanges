import java.util.Scanner;

public class Main {

    static boolean asal(int n, int i)
    {

        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return asal(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Sayı giriniz: ");
            int num = scan.nextInt();
            boolean result = asal(num,2);
            if (result){
                System.out.println("Asal sayıdır.");
            }else {
                System.out.println("Asal sayı değildir.");
            }
        }

    }
}
