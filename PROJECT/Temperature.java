import java.util.Scanner;

public class Temperature {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for temperature value and unit
        System.out.print("Enter the temperature value: ");
        double tempValue = scanner.nextDouble();
        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        String unit = scanner.next().toUpperCase();

        // Initialize variables to store converted temperatures
        double celsius = 0, fahrenheit = 0, kelvin = 0;

        // Convert based on the original unit
        switch (unit) {
            case "C":
                celsius = tempValue;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "F":
                fahrenheit = tempValue;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = fahrenheitToKelvin(fahrenheit);
                break;
            case "K":
                kelvin = tempValue;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = kelvinToFahrenheit(kelvin);
                break;
            default:
                System.out.println("Invalid unit of measurement.");
                return;
        }

        // Display the converted temperatures
        System.out.printf("%nTemperature conversions:%n");
        System.out.printf("Celsius: %.2f °C%n", celsius);
        System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Kelvin: %.2f K%n", kelvin);

        scanner.close();
    }
}
