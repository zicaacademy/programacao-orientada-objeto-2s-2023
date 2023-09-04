import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Digite 1 ou 2: ");
        int escolha = scanner.nextInt();

        double temperatura;
        double resultado;

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = scanner.nextDouble();
            resultado = celsiusParaFahrenheit(temperatura);
            System.out.println("Resultado: " + resultado + " Fahrenheit");
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = scanner.nextDouble();
            resultado = fahrenheitParaCelsius(temperatura);
            System.out.println("Resultado: " + resultado + " Celsius");
        } else {
            System.out.println("Escolha inválida. Por favor, digite 1 ou 2.");
        }

        scanner.close();
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
