import java.util.Scanner;

public  class Bayos {
    public static  void main(String[] args) {
    
        System.out.println("===== Basta ATM =====");
        System.out.println("1. Check Balance ");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Babush");

        int Bal = 5000;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Choice: ");
        int Choice = input.nextInt();

    switch(Choice){
    case 1:
        System.out.println("CurrentBalance: " + Bal);
    break;
    case 2:
        System.out.println("Enter Deposit Amount: ");
        int DepositAmount = input.nextInt();

        if (DepositAmount <=0 ) {
            System.out.println("Invalid Amount");

        } else {
            Bal += DepositAmount;
            System.out.println("Successfully Deposited!");
            System.out.println("Current Balance: " + Bal);
        }
        break;
        case 3:
            System.out.println("Withdraw Amount:");
            int Withdraw = input.nextInt();

            if (Withdraw > Bal) {
                System.out.println("Insufficient Balance!");

            } else if (Withdraw <= 0 ) {
                System.out.println("Invalid Amount");

            } else {
                Bal -= Withdraw;
                System.out.println("Successfull Withdrawal");
                System.out.println("Remaining Balance: " + Bal);

            }
            break;
            case 4:
                System.out.println("Thank you for using me as your playtoy!");
            break;
            default:
                System.out.println("Bobo wala sa choices");

                input.close();







            

    }

    }
}