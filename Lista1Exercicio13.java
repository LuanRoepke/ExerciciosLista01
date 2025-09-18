

package lista1;

/* Escrever um algoritmo que lê a taxa de consumo de potência elétrica de um refrigerador,
o tempo em horas que permaneceu ligado e o valor do quilowatt hora e calcular
e escrever a energia total gasta pelo refrigerador, bem como, o valor a ser pago
à companhia de Energia Elétrica.     */

import java.util.Scanner;


public class Lista1Exercicio13 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaração das variáveis
        double potenciaW, potenciaKW, tempoH, valorKWh;
        double energiaTotal, valorPago;

        // Entrada de dados
        System.out.print("Digite a potência do refrigerador (em Watts): ");
        potenciaW = entrada.nextDouble();

        System.out.print("Digite o tempo ligado (em horas): ");
        tempoH = entrada.nextDouble();

        System.out.print("Digite o valor do kWh (em R$): ");
        valorKWh = entrada.nextDouble();

        // Conversão para kW
        potenciaKW = potenciaW / 1000.0;

        // Cálculos
        energiaTotal = potenciaKW * tempoH;      // em kWh
        valorPago = energiaTotal * valorKWh;     // custo em R$

        // Saída formatada
        System.out.printf("\nEnergia total gasta: %.2f kWh\n", energiaTotal);
        System.out.printf("Valor a ser pago: R$ %.2f\n", valorPago);

        entrada.close();
    }
}
