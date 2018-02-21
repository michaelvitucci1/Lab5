import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }

    /**
     * set the account number.
     * @param setAccountNumber the account number to be set.
     */
    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    /**
     *
     * @param setAccountType
     */
    public void setAccountType(final BankAccountType setAccountType) {
        this.accountType = setAccountType;
    }

    /**
     *
     * @param setAccountNumber
     */
    public void setAccountBalance(final int setAccountNumber) {
        this.accountBalance = setAccountNumber;
    }

    /**
     *
     * @param setAccountNumber
     */
    public void setOwnerName(final String setAccountNumber) {
        this.ownerName = setAccountNumber;
    }

    /**
     *
     * @param setInterestRate
     */
    public void setInterestRate(final int setInterestRate) {
        this.interestRate = setInterestRate;
    }
    /**
     * getter to return the account number.
     * @return the account number.
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public String getOwnerName() {
        return this.ownerName;
    }
    public double getInterestrRate() {
        return this.interestRate;
    }
}
