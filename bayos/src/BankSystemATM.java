import java.util.Scanner;
public class BankSystemATM {
    public static void main(String[] args) {
        System.out.println("===== SIMPLE ATM SYSTEM =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        int CurrentBal = 5000;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Choice: ");
        int Choice = input.nextInt();

        switch(Choice){
            case 1:
                System.out.println("Remaining Balance: " + CurrentBal);
                break;
                case 2:
                    System.out.print("Enter your Deposit Amount: ");
                    int DepositAmount = input.nextInt();

                    if (DepositAmount <=0 ) {
                        System.out.println("Invalid Amount");


                    } else {
                        CurrentBal += DepositAmount;
                        System.out.println("Successfully Deposited");
                        System.out.println("Remaining Balance: " + CurrentBal);

                    }
                break;
                case 3:
                    System.out.print("Enter your Withdrawal Amount: " );
                    int WithdrawalAmount = input.nextInt();

                    if (WithdrawalAmount > CurrentBal) {
                        System.out.println("Insufficient Balance");

                    } else if (WithdrawalAmount <= 0 ) {
                        System.out.println("Invalid Amount");

                    } else {
                        CurrentBal -= WithdrawalAmount;
                        System.out.println("Successfully Withdraw");
                        System.out.println("Remaining Balance: " + CurrentBal);

                    }
                break;
                case 4:
                    System.out.println("Thank you for using our ATM");
                break;
                default:
                    System.out.println("Invalid Choices");

                    input.close();




        }


    }
    
}
