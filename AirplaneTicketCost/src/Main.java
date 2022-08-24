import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km,age,type;
        double costPerKm = 0.1;
        double normalCost;
        double discount=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        km = inp.nextInt();
        System.out.print("Enter your age: ");
        age=inp.nextInt();
        System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip): ");
        type = inp.nextInt();
        if ((km>=0) && (age>=0) && (type==2 || type==1)){
            normalCost = (km * costPerKm);
            if(age<12){
                discount = normalCost * 0.5;
            }else if (age>=12 && age<=24){
                discount = normalCost*0.1;
            } else if (age>=65){
                discount = normalCost*0.3;
            }
            normalCost -= discount;
            if (type==2){
                discount=normalCost *0.2;
                normalCost-=discount;
                normalCost *=2;
            }
            System.out.print("Total amount: "+normalCost);
        }else{
            System.out.println("Your information is wrong please try again.");
        }

    }
}
