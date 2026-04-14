import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double pesoAlvo = 500.0;
        double pesoAtual = 0.0;
        int ciclo = 0;

        System.out.println("Simulador de peso: ");
        System.out.println("Meta: " + pesoAlvo + "kg de Brita 1" );

        do{
            System.out.print("Digite o peso atual da Brita 1 (kg): ");
            pesoAtual = scanner.nextDouble();
            ciclo++;

            if (pesoAtual < pesoAlvo) {
                System.out.println("Peso atual: " + pesoAtual + "kg. Ainda faltam " + (pesoAlvo - pesoAtual) + "kg para atingir a meta.");
            } else {
                System.out.println("Peso atual: " + pesoAtual + "kg. Meta atingida!");
            }
        } while (pesoAtual < pesoAlvo);

        System.out.println("Número de ciclos: " + ciclo);
        scanner.close();
    }
}
