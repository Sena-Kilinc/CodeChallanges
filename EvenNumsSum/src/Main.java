import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,total=0,count=0;
        double avg=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        k=inp.nextInt();
        for (int i =0;i<=k;i++){
            if (i%3==0 && i%4==0){
                total += i;
                count++;
            }
        }
        avg=total/count;
        System.out.println("Average: "+avg);
    }
}
