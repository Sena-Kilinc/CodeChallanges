import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean loop=true;
        while(loop){
            int num,sum=0;
            System.out.println();
            System.out.print("bir sayı giriniz: ");
            num=inp.nextInt();
            for (int i=1;i<num;i++){
                if (num%i==0){
                    sum+=i;
                }
            }
            if (sum==num){
                System.out.println(num+" Mükemmel bir sayıdır.");
            }else {
                System.out.println(num+" Mükemmel bir sayı değildir.");
            }

        }

    }
}
