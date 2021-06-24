package card;

import java.math.BigDecimal;

public class Currency {
    private String name;
    private BigDecimal exchangeRate;

    public Currency(String name, BigDecimal exchangeRate) {
        this.name = name;
        if (exchangeRate.compareTo(BigDecimal.ZERO) >= 0) {
            this.exchangeRate = exchangeRate;
        } else {
            System.out.println("card.Currency can not be negative");
        }
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public String getName() {
        return name;
    }
}
