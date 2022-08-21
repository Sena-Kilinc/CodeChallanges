import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float armut = 2.14F;
        float elma = 3.67F;
        float domates = 1.11F;
        float muz = 0.95F;
        float patlican = 5.0F;
        float total = 0.0F;
        float var = 0.0F;
        System.out.print("Armut kaç kilo?: ");
        var=input.nextFloat();
        total+=var*armut;

        System.out.print("Elma kaç kilo?: ");
        var=input.nextFloat();
        total+=var*elma;

        System.out.print("Domates kaç kilo: ?");
        var=input.nextFloat();
        total+=var*domates;

        System.out.print("Muz kaç kilo?: ");
        var=input.nextFloat();
        total+=var*muz;

        System.out.print("Patlıcan kaç kilo?: ");
        var=input.nextFloat();
        total+=var*patlican;

        System.out.println("Toptal Tutar: "+total+" TL");
    }
}
