import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr = {15,12,788,1,-1,-778,2,0};
        Scanner scan= new Scanner(System.in);
        System.out.print("Dizi: {");
        for (int i:arr){
            System.out.print(i+", ");
            if(i==0){
                System.out.print(i);
            }
        }
        System.out.print("}");
        System.out.println();
        System.out.print("Girilen Sayı: ");
        int num=scan.nextInt();

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[0];



        for (int i:arr){
            if (i<num){
                min = i; // we want to get as close as to our number
            }
        }

        for (int i: arr){
            if (i>num){
                max=i; // we want to get just the closest one
                break;
            }

        }

        System.out.println("Minimum number closer to your number: "+min);
        System.out.println("Maximum number closer to your number: "+max);
    }
}
