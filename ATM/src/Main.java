import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Username :");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("sena") && password.equals("123")) {
                System.out.println("Welcome to the ATM!");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdrawal\n" +
                            "3-Question Balance\n" +
                            "4-Log Out");
                    System.out.print("Select the process that you want : ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Amount of Money : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Amount of Money : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Not enough balance.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Balance : " + balance);
                            break;
                        case 4:
                            System.out.println("Logging out...");
                            break;
                        default:
                            System.out.println("Please enter available processes.");
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Wrong username or password. Try again.");
                    System.out.println("Your Remaining Rights : " + right);
                }
            }
        }
    }
}