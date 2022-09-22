import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dimension of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter te elements of array:");
        for (int i =0;i<arr.length;i++){
            System.out.print((i+1)+". Element: ");
            arr[i]= scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Order of the array: ");
        for (int i:arr){
            System.out.print(i+" ");
        }


    }
}
