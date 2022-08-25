import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,r,facN=1,facR=1,facE=1,combination;
        System.out.print("Enter the number of elements: ");
        n=inp.nextInt();
        System.out.print("Enter the number of groups: ");
        r=inp.nextInt();
        for (int i=1;i<=n;i++){
            facN *=i;
        }
        for (int i=1;i<=r;i++){
            facR *=i;
        }
        for (int i =1;i<=(n-r);i++){
            facE *= i;
        }
        combination = facN/(facR*facE);
        System.out.println("Combination result: "+combination);


    }
}
