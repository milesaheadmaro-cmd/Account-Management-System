import java.util.Scanner;
public class ClientPasco {
    
    static SavingsAccountPasco[] sa =
        new SavingsAccountPasco[100];
static int count = 0;

public static void displayMainMenu() {
    System.out.println("\n===== JBank Main Menu =====");
    System.out.println("[1] New Account");
    System.out.println("[2] Balance Inquiry");
    System.out.println("[3] Deposit");
    System.out.println("[4] Withdraw");
    System.out.println("[5] Client Profile");
    System.out.println("[6] Close Account");
    System.out.println("[7] Exit");
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            displayMainMenu();
            System.out.print("Enter choice: ");
            option = input.nextInt();
            switch (option) {
                
case 1:
    newAccount(input);
    break;
case 2:
    balanceInquiry(input);
    break;
case 3:
    deposit(input);
    break;
case 4:
    withdraw(input);
    break;
case 5:
    clientProfile(input);
    break;
case 6:
    closeAccount(input);
    break;
                case 7:
                    System.out.println("Thank you for using JBank.");
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        } while (option != 7);
        input.close();
    }
    public static void newAccount(Scanner input) {
    System.out.println("\n=== NEW ACCOUNT ===");
    System.out.print("Client Name: ");
    input.nextLine();
    String name = input.nextLine();
    System.out.print("Address: ");
    String address = input.nextLine();
    System.out.print("Birthday: ");
    String birthday = input.nextLine();
    System.out.print("Contact Number: ");
    String contact = input.nextLine();
    double initialDeposit;
    do {
        System.out.print("Initial Deposit: ");
        initialDeposit = input.nextDouble();
        if (initialDeposit < 5000) {
            System.out.println("Minimum deposit is 5000.");
        }
    } while (initialDeposit < 5000);
    int acctNo =
            (int)(Math.random() * 9000) + 1000;
    sa[count] = new SavingsAccountPasco(
            acctNo,
            initialDeposit,
            0.05,
            name,
            address,
            birthday,
            contact);
    count++;
    System.out.println("\nAccount Created Successfully!");
    System.out.println("Account Number: " + acctNo);
}
    public static void balanceInquiry(Scanner input) {
    System.out.print("Enter Account Number: ");
    int acctNo = input.nextInt();
    boolean found = false;
    for (int i = 0; i < count; i++) {
        if (sa[i].validateAcctNumber(acctNo)) {
            System.out.println("\n===== ACCOUNT INFO =====");
            sa[i].balanceInquiry();
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Account Not Found.");
    }
}
    public static void deposit(Scanner input) {
    System.out.print("Enter Account Number: ");
    int acctNo = input.nextInt();
    boolean found = false;
    for (int i = 0; i < count; i++) {
        if (sa[i].validateAcctNumber(acctNo)) {
            System.out.print("Deposit Amount: ");
            double amount = input.nextDouble();
            sa[i].deposit(amount);
            found = true;
            break;
        }
    } //
    }
    public static void withdraw(Scanner input) {
    System.out.print("Enter Account Number: ");
    int acctNo = input.nextInt();
    boolean found = false;
    for (int i = 0; i < count; i++) {
        if (sa[i].validateAcctNumber(acctNo)) {
            System.out.print("Withdrawal Amount: ");
            double amount = input.nextDouble();
            sa[i].withdraw(amount);
            found = true;
            break;
        }
    } //
    }
    public static void clientProfile(Scanner input) {
    System.out.print("Enter Account Number: ");
    int acctNo = input.nextInt();
    boolean found = false;
    for (int i = 0; i < count; i++) {
        if (sa[i].validateAcctNumber(acctNo)) {
            System.out.println("\n===== CLIENT PROFILE =====");
            System.out.println("Account Number : "
                    + sa[i].getAccountNo());
            sa[i].getClientDetails();
            System.out.println("Balance        : "
                    + sa[i].getBalance());
            found = true;
            break;
        }
    } //
    }
    public static void closeAccount(Scanner input) {
    System.out.print("Enter Account Number: ");
    int acctNo = input.nextInt();
    boolean found = false;
    for (int i = 0; i < count; i++) {
        if (sa[i].validateAcctNumber(acctNo)) {
            System.out.print("Close Account? (Y/N): ");
            char choice = input.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                sa[i].closeAccount();
            } else {
                System.out.println("Account Closure Cancelled.");
            }
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Account Not Found.");
    }
}
}