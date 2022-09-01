import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = inp.nextInt();
        int temp1=0,temp2=0;
        for (int i = 1 ; i<=n;i++){
            System.out.print(i+". Sayıyı giriniz: ");
            int num1 = inp.nextInt();
            if (i==1){
                temp1=num1;
                temp2=num1;
            }else{
                if (num1>temp1){
                    temp1 = num1;
                }
                if (temp2>num1){
                    temp2 = num1;
                }
            }

        }

        System.out.println("En büyük sayı: "+temp1);
        System.out.println("En küçük sayı: "+temp2);


    }
}
