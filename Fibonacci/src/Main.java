import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("Kaç elemanlı bir dizi?:");
        int nums=inp.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(nums+ " Elemanlı Fibonnaci Serisi : ");
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for (int i=2;i<=nums;i++){
            n3 = n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
