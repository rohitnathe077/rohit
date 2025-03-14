import java.util.Scanner;

public class ATMSystemFinalCorrected {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\\\\=========================================================================////");
        System.out.println("             <||     Welcome To Atm   ||>");
        System.out.println("\\\\=========================================================================////");
        
        int balance = 0; // Initialize balance
        int choice;

        do {
            System.out.print("Enter your choice (1: Display Balance, 2: Withdraw, 3: Deposit, 4: Exit): ");
            choice = in.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Displaying Balance: ");
                    displayBalance(balance);
                    break;
                }
                case 2: {
                    System.out.println("Withdraw Amount: ");
                    int withdrawAmount = in.nextInt();
                    balance = withdraw(balance, withdrawAmount);
                    break;
                }
                case 3: {
                    System.out.println("Enter Deposit Amount: ");
                    int amountDeposit = in.nextInt();
                    balance = deposit(balance, amountDeposit);
                    break;
                }
                case 4: {
                    System.out.println("Exiting. Thank you!");
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        } while (choice != 4);
        
        in.close(); // Close the scanner
    }

    // Display current balance in account 
    public static void displayBalance(int balance) {
        System.out.println("Current balance: " + balance);
        System.out.println();
    }
    
    // Withdraw amount and update the balance
    public static int withdraw(int balance, int withdrawAmount) {
        System.out.println("Withdraw Operation: ");
        System.out.println("Withdrawing Amount: " + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and your card.");
            displayBalance(balance);
            return balance;
        } else {
            System.out.println("Sorry! Insufficient Funds.");
            System.out.println();
            return -1;
        }
    }

    // Deposit amount and update the balance 
    public static int deposit(int balance, int amountDeposit) {
        System.out.println("Deposit Operation: ");
        System.out.println("Depositing Amount: " + amountDeposit);
        balance = balance + amountDeposit;
        System.out.println("Your Money has been successfully deposited.");
        displayBalance(balance);
        return balance;  
    }
}

