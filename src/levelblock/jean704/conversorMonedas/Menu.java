package levelblock.jean704.conversorMonedas;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final Map<String, Double> rates;
    private static final List<String> LATAM_CURRENCIES = List.of(
            "USD","ARS", "BRL", "CLP", "COP", "CRC", "CUP", "DOP", "MXN", "PEN", "PYG", "UYU", "VES"
    );

    public Menu(Map<String, Double> rates) {
        this.rates = rates;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("******************************");
            System.out.println("Seleccione la Moneda de origen:");
            int i = 1;

            // Filtra solo las monedas de Latinoamérica
            for (String currency : rates.keySet()) {
                if (LATAM_CURRENCIES.contains(currency)) {
                    System.out.printf("%d.- Convertir %s \n", i++, currency);
                }
            }

            System.out.println("X.- Salir.");
            System.out.println("******************************");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("X")) {
                System.out.println("¡Hasta luego!");
                break;
            }

            try {
                int index = Integer.parseInt(option);
                if (index >= 1 && index <= LATAM_CURRENCIES.size()) {
                    String baseCurrency = LATAM_CURRENCIES.get(index - 1);
                    handleConversion(scanner, baseCurrency);
                } else {
                    System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduzca un número válido.");
            }
        }

        scanner.close();
    }

    private void handleConversion(Scanner scanner, String baseCurrency) {
        System.out.println("Introduce el monto a convertir:");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.println("Seleccione la moneda de destino:");
        int i = 1;
        for (String currency : LATAM_CURRENCIES) {
            System.out.printf("%d.- %s\n", i++, currency);
        }

        int targetIndex = Integer.parseInt(scanner.nextLine());
        if (targetIndex >= 1 && targetIndex <= LATAM_CURRENCIES.size()) {
            String targetCurrency = LATAM_CURRENCIES.get(targetIndex - 1);
            CurrencyConverter converter = new CurrencyConverter(rates);
            double result = converter.convert(baseCurrency, targetCurrency, amount);
            System.out.printf("Resultado: %.2f %s son %.2f %s\n", amount, baseCurrency, result, targetCurrency);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
