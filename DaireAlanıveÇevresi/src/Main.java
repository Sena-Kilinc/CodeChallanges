import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14,alan,cevre,a;

        Scanner scr = new Scanner(System.in);

        System.out.println("r: ");
        r = scr.nextInt();
        System.out.println("Merkez açının ölçüsünü giriniz: ");
        a = scr.nextDouble();

        alan = pi * r * r;
        System.out.println("Alan: " + alan);
        cevre = 2 * pi * r;
        System.out.println("Çevres: " + cevre);
        alan = (pi*(r*r)*a)/360;
        System.out.println("Dairenin dilim alanı: " + alan);

    }
}
