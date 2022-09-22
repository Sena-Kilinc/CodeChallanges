public class Main {
    static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {10,20,20,10,10,20,5,20};
        int [] dup = new int[arr.length];
        for (int i =0;i<arr.length;i++){
            int count = 1;
            if (!isFind(dup, arr[i])){
                for (int j=0;j<arr.length;j++){
                    if (i!=j && arr[i]==arr[j]){
                        dup[i] =arr[i];
                        count++;
                    }
                }
                System.out.println(arr[i]+" number repeated "+count+" times.");

            }

        }

    }
}
