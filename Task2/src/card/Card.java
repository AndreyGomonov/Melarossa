package card;

import java.math.BigDecimal;

public class Card {
    private String cardHolder;
    private long cardNumber;
    private BigDecimal balance;

    public Card(String cardHolder, long cardNumber, BigDecimal balance) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public Card(String cardHolder, long cardNumber) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.balance = BigDecimal.ZERO;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void withdraw(BigDecimal amountToWithdraw) {
        if (balance.compareTo(amountToWithdraw) >= 0) {
            this.balance = this.balance.subtract(amountToWithdraw);
        } else {
            System.out.println("Withdrawal denied");
        }
    }

    public void add(BigDecimal amountToAdd) {
        this.balance = this.balance.add(amountToAdd);
    }

    public void displayInDifferentCurrency(Currency currency) {
        BigDecimal balanceInDifferentCurrency = this.balance.multiply(currency.getExchangeRate());
        System.out.println("Balance in " + currency.getName() + " is " + balanceInDifferentCurrency);
    }

}
