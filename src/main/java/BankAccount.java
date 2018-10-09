import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * This is the constructor for BankAccount Type.
     */
    public enum BankAccountType {
        /**
         * You may want to use this to distinguish between different kinds of accounts.
         */
        CHECKINGS,
        /**
         * You may want to use this to distinguish between different kinds of accounts.
         */
        SAVINGS,
        /**
         * You may want to use this to distinguish between different kinds of accounts.
         */
        STUDENT,
        /**
         * You may want to use this to distinguish between different kinds of accounts.
         */
        WORKPLACE
    }

    /**
     * This is account Number.
     */
    private int accountNumber;
    /**
     * This is type of account.
     */
    private BankAccountType accountType;
    /**
     * This is the balance.
     */
    private double accountBalance;
    /**
     * this is the name.
     */
    private String ownerName;
    /**
     * this is the interest rate.
     */
    private double interestRate;

    /**
     * Getter for Account number.
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * setter for the accountNumber.
     * @param setAccountNumber passed account Number
     */
    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    /**
     * This is getting the account type.
     * @return the account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * Set the account types.
     * @param setAccountType the passed account type
     */
    public void setAccountType(final BankAccountType setAccountType) {
        this.accountType = accountType;
    }

    /**
     * Set account balance.
     * @return the account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Set the account balance.
     * @param setAccountBalance the passed account balance
     */
    public void setAccountBalance(final double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }

    /**
     * Getting the owner name.
     * @return owner name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Set the ownerName.
     * @param setOwner the new name.
     */
    public void setOwnerName(final String setOwner) {
        this.ownerName = setOwner;
    }
    /**
     * Set Owner name.
     * @return Set Owner name.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Set Owner name.
     * @param setInterestRate Set Owner name.
     */
    public void setInterestRate(final double setInterestRate) {
        this.interestRate = setInterestRate;
    }

    /**
     * Set Owner name.
     * @return Set Owner name.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Set Owner name.
     * @param setInterestEarned Set Owner name.
     */
    public void setInterestEarned(final double setInterestEarned) {
        this.interestEarned = setInterestEarned;
    }

    /**
     * this is the interest earned.
     */
    private double interestEarned;

    /**
     * This is the constructor for a bank account.
     * @param name This is the name of the owner
     * @param accountCategory this is the account category
     */

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
