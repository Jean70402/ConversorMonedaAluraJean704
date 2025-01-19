package levelblock.jean704.conversorMonedas;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        ExchangeRateService service = new ExchangeRateService();
        Gson gson = new Gson();

        try {
            String jsonResponse = service.getExchangeRates("USD");
            CurrencyData data = gson.fromJson(jsonResponse, CurrencyData.class);

            Menu menu = new Menu(data.getConversionRates());
            menu.showMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

