import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3 kenarı verilen üçgenin alanını bulma
        Scanner input = new Scanner(System.in);
        double a,b,c,u,alan;
        System.out.println("1.Kenarı giriniz :");
        a= input.nextDouble();
        System.out.println("2.Kenarı giriniz :");
        b= input.nextDouble();
        System.out.println("3.Kenarı giriniz :");
        c= input.nextDouble();
        u= (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı: "+alan);
        
    }
}
