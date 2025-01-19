package levelblock.jean704.conversorMonedas;

import java.util.Map;

public class CurrencyData {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public String getBaseCode() {
        return base_code;
    }

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }
}
