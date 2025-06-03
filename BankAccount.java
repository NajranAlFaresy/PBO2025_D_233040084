package TugasFinalDanStatic;

public class BankAccount { // tugas 2
    private final String accountNumber; // Tidak boleh diubah
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public final void displayAccountInfo() {
        System.out.println("No Rekening: " + accountNumber);
        System.out.println("Saldo: " + balance);
    }
}
