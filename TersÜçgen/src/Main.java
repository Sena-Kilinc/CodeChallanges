import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Kaç basamaklı olsun?:");
        Scanner inp=new Scanner(System.in);
        int num= inp.nextInt();
        // n adet basamak; her basamakta -1 adet boşluk ve yıldızlar
        for (int i=num;i>=1;i--){
            for (int j=1;j<=num-i;j++){ //boşluk
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
