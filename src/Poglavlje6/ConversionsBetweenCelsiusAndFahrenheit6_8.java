package Poglavlje6;

public class ConversionsBetweenCelsiusAndFahrenheit6_8 {
    public static void main(String[] args) {

        System.out.println("Celsius\t\t\tFahrenheit\t|\tFahrenheit\t\t\tCelsius");
        for (double i = 40.0, j = 120.0; i >= 31.0 && j >= 30.0; i-- , j -= 10) {
            System.out.println(i+"\t\t\t"+celsiusToFahrenheit(i)+"\t|\t"+j+"\t\t\t"+fahrenheitToCelsius(j));
        }

    }
    public static double celsiusToFahrenheit(double celsius) {
        return  (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);

    }
}
