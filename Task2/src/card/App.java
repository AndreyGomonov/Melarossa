package card;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BigDecimal balance = BigDecimal.valueOf(100);
        BigDecimal exchangeRate = BigDecimal.valueOf(2.55);
        Card card = new Card("John", 1234, balance);
        System.out.println(card.getBalance());

        card.withdraw(balance);
        System.out.println(card.getBalance());

        card.add(balance);
        System.out.println(card.getBalance());

        Currency currency = new Currency("USD", exchangeRate);

        card.displayInDifferentCurrency(currency);

        Card anotherCard = new Card("Tom", 6789);
        System.out.println(anotherCard.getBalance());

        anotherCard.withdraw(balance);

    }
}
