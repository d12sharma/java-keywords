public class BankAccount {
        private static String bankName = "PNB Bank";
        private String accountHolderName;
        private final int accountNumber;
        private  static int totalAccounts=0;
        private double balance;


        BankAccount(String accountHolderName , int accountNumber , double balance){
            this.accountHolderName=accountHolderName;
            this.accountNumber=accountNumber;
            this.balance=balance;
            totalAccounts++;
        }
        public void showDetails(){
            System.out.println("Bank Name:"+bankName);
            System.out.println("Account Holder:"+accountHolderName);
            System.out.println("Account Number:"+accountNumber);
            System.out.println("Balance:"+balance);

        }
        public static void getTotalAccounts(){
            System.out.println("Total Accounts :"+totalAccounts);
        }

            public static void main(String[] args) {
                BankAccount account1 = new BankAccount("Dhruv Sharma", 508546006, 10000);
                account1.showDetails();
                BankAccount account2 = new BankAccount("Naam Simran", 501233456, 10004);
                account2.showDetails();

                BankAccount.getTotalAccounts();
            }

}
