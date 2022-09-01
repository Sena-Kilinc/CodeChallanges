import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         // ebob en büyük ortak bölen; ekok en küçük ortak kat
        Scanner inp = new Scanner(System.in);
        int ebob = 0,ekok=0;
        System.out.print("İlk sayıyı giriniz: ");
        int n1= inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2=inp.nextInt();
        if(n1<n2){
            for (int i=1;i<=n1;i++){
                if (n1%i==0 && n2%i==0){
                    //System.out.println(i);
                    ebob=i;
                }
            }
            for(int k=1; k<=n1*n2;k++){
                if (k%n1==0 && k%n2==0){
                    //System.out.println(i);
                    ekok=k;
                    break;
                }
            }
        }else{
            for (int i=1;i<=n2;i++){
                if (n1%i==0 && n2%i==0){
                    System.out.println(i);
                    ebob=i;
                }
            }for(int k=1; k<=n1*n2;k++){
                if (k%n1==0 && k%n2==0){
                    //System.out.println(i);
                    ekok=k;
                    break;
                }
            }
        }
        System.out.println("Ebob: "+ebob);
        System.out.println("Ekok: "+ekok);
    }
}
