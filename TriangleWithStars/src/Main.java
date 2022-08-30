import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("How many rows?: ");
        int n=inp.nextInt();
        for (int i =1; i<=n;i++){ // rows
            for (int j=1; j<=n-i;j++){ //blanks
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++){//stars
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
