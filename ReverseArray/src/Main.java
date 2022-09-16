public class Main {
    public static int [] reverse(int[] list){
        int [] reverse = new int[list.length];
        for (int i=0,j=list.length-1;i<list.length;i++,j--){
            reverse[i]=list[j];
        }
        return reverse;
    }

    public static void printArray(int[] list){
        for (int i = 0; i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] list = {10,20,30,50};
        int[] reverse = reverse(list);
        printArray(reverse);

    }
}
