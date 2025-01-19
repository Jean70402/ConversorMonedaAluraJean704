package levelblock.jean704.conversorMonedas;

import java.util.Map;

public class CurrencyConverter {
    private final Map<String, Double> rates;

    public CurrencyConverter(Map<String, Double> rates) {
        this.rates = rates;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (!rates.containsKey(fromCurrency) || !rates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Currency not supported");
        }

        double rateFromBase = rates.get(fromCurrency);
        double rateToBase = rates.get(toCurrency);

        return (amount / rateFromBase) * rateToBase;
    }
}
