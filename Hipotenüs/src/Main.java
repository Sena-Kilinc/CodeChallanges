import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.println("1.Kenarı giriniz :");
        a= input.nextDouble();
        System.out.println("2.Kenarı giriniz :");
        b= input.nextDouble();

        c= Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüs : "+c);
    }
}
