public class ATM{
    private boolean userAuthenticated;  // whether user is authenticated
    private int currentAccountNumber;  // current user's account number
    private Screen screen;   // ATM's screen
    private Keypad keypad;   // ATM's keypad
    private CashDispenser cashDispenser;  // ATM's cash dispenser
    private DepositSlot depositSlot;  // ATM's deposit slot
    private BankDatabase bankDatabase;  // account information database

    // Constants corresponding to main menu options
    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;

    public ATM(){
        userAuthenticated = false;  // user in not authenticated to start
        currentAccountNumber = 0;  // no current account number to start
        screen = new Screen();  // create screen
        keypad = new Keypad(); // create keypad
        cashDispenser = new CashDispenser();  // create cash dispenser
        depositSlot = new DepositSlot();  // create deposit slot
        bankDatabase = new BankDatabase();  // create account info database
    }

    public void run(){
        // welcome and authenticate user
        while(true){
            while(!userAuthenticated){
                screen.displayMessageLine("\nWelcome");
                authenticateUser();  // authenticate user
            }
            performTransaction(); // user is now authenticated
            userAuthenticated = false;  // reset before next ATM session
            currentAccountNumber = 0;  // reset before next ATM session
            screen.displayMessageLine("\nThank you! Goodbye!");
        }
    }
    private void authenticateUser(){
        screen.displayMessage("\nPlease enter your account number: ");
        int accountNumber = keypad.getInput();
        screen.displayMessage("\nEnter your PIN: ");
        int pin = keypad.getInput();

        userAuthenticated = bankDatabase.authenticateUser(accountNumber, pin);

        if(userAuthenticated){
            currentAccountNumber = accountNumber;  // save user's account number
        }else{
            screen.displayMessageLine("Invalid account number or PIN. Please try again.");
        }
    }

    private void performTransaction(){
        // local variable to store transaction currently being processed
        Transaction currentTransaction = null;
        boolean userExited = false;  // user has not chosen to exit

        while(!userExited){
            // show main menu and get user selection
            int mainMenuSelection = displayMainMenu();

            switch(mainMenuSelection){
                case BALANCE_INQUIRY:
                case WITHDRAWAL:
                case DEPOSIT:
                    currentTransaction = createTransaction(mainMenuSelection);
                    currentTransaction.execute();
                    break;
                case EXIT:
                    screen.displayMessageLine("\nExiting the system...");
                    userExited = true;
                    break;
                default:
                    screen.displayMessageLine("\nYou didnot enter a  valid selection. Try again.");
                    break;
            }
        }
    }

    private int displayMainMenu(){
        screen.displayMessageLine("\nMain Menu: ");
        screen.displayMessageLine("1 - View my balance");
        screen.displayMessageLine("2 - Withdraw cash" );
        screen.displayMessageLine("3 - Deposit funds" );
        screen.displayMessageLine("4 - Exit\n");
        screen.displayMessage("Enter a choice: ");
        return keypad.getInput();// return user's selection
    }

    private Transaction createTransaction(int type){
        Transaction temp = null;

        switch(type){
            case BALANCE_INQUIRY:
                temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
                break;
            case WITHDRAWAL:
                temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
                break;
            case DEPOSIT:
                temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
                break;
        }

        return temp;
    }
}
