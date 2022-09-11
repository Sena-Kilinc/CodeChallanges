import java.util.Scanner;

public class Main {
    static int power(int taban,int us){
        if (us==0){
            return 1;
        }
        return taban*power(taban, us-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Üs değerini giriniz:");
        int us=scan.nextInt();
        int sonuc = power(taban,us);
        System.out.println("Sonuç: "+sonuc);
    }
}
