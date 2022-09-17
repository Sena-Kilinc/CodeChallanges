public class Main {
    public static void main(String[] args) {
        int [][] matrix = new int[3][4];
        int num=1;
        for (int i=0;i<matrix.length;i++){
            for (int j =0;j<matrix[i].length;j++){
                matrix[i][j]= num;
                num++;
            }
        }
        /*
        for (int i=0;i<matrix.length;i++){
            for (int j =0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
         */

        for (int[] row:matrix){
            for (int elem : row){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
}
