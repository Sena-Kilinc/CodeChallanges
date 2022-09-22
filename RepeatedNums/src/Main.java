import java.util.Arrays;

public class Main {
    /*
    Finding duplicated numbers in an array
     */
    static boolean isFind(int[] arr,int value){
        for (int i: arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] arr={2,2,5,6,7,3,3,4,4,4};
        int[] duplicate = new int[arr.length];
        int[] evenDuplicate = new int[arr.length];

        int startIndex =0;

        for (int i =0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                if (i != j && arr[i]==arr[j]){
                    if (!isFind(duplicate, arr[i])){
                        duplicate[startIndex++]=arr[i];
                    }
                }
            }
        }
        System.out.print("Duplicated numbers: ");
        for (int i:duplicate){
            if (i!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        /*
    Finding duplicated even numbers in an array
     */

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i != j && arr[i]==arr[j]){
                    if (arr[i]%2 ==0){
                        if (!isFind(evenDuplicate, arr[i])){
                            evenDuplicate[startIndex++]=arr[i];
                        }
                    }
                }
            }
        }
        System.out.print("Duplicated even numbers: ");
        for (int i:evenDuplicate){
            if (i!=0){
                System.out.print(i+" ");
            }
        }
    }
}
