import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matrix: ");
        int[][] arr= {{1,2,3},{4,5,6}};
        int row = 2;
        int col= 3;

        for (int i=0;i< arr.length;i++){ //row
            for (int j=0;j<arr[i].length;j++){ //col
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("Transpose: ");
        for (int i=0;i<col;i++){ //col
            for (int j = 0;j<row;j++){ //row
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
