package TugasFinalDanStatic;

public class SavingsAccount extends BankAccount { // tugas 2
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // Uncommenting the code below akan menyebabkan error
    /*
    @Override
    public void displayAccountInfo() {
        System.out.println("Ini tidak boleh dilakukan karena method final.");
    }
    */
}
