import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int num = sc.nextInt();
        int count = 0,total=0;
        while(num != 0)
        {
            total +=  (num%10);
            num /= 10;
            ++count;
        }
        System.out.println("basamak sayısı : " + count);
        System.out.println("basamak toplamı: " + total);
    }
}
