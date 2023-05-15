package lesson_11;

public class Loan {
    private final int amount;
    private final String loanNumber;

    public Loan(int amount, String loanNumber) {
        this.amount = amount;
        this.loanNumber = loanNumber;
    }

    public int getAmount() {
        return amount;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                ", loanNumber='" + loanNumber + '\'' +
                '}';
    }
}
