

package lista1;

/* Uma autolocadora aluga seus carros com uma taxa fixa por dia, 
uma taxa por Km rodado e desconto de 10% na taxa fixa de aluguel por dia. 
Escrever um algoritmo que lê a taxa fixa por dia, a taxa por Km rodado,
o número de dias, o número de quilômetro rodado e
calcular e escrever o valor total do aluguel, o valor do desconto, o numero de dias, 
e a quilometragem rodada.    */

import java.util.Scanner;


public class Lista1Exercicio12 {
    
    public static void main(String[] args) {
        // Declaração das variáveis
        double taxaDia, taxaKm, valorTaxa, valorDesconto, valorKm, valorTotal;
        int dias;
        double kmRodado;
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a taxa fixa por dia: R$ ");
        taxaDia = entrada.nextDouble();

        System.out.print("Digite a taxa por Km rodado: R$ ");
        taxaKm = entrada.nextDouble();

        System.out.print("Digite o número de dias: ");
        dias = entrada.nextInt();

        System.out.print("Digite a quilometragem rodada: ");
        kmRodado = entrada.nextDouble();

        // Cálculos
        valorTaxa = taxaDia * dias;                 // valor bruto da taxa fixa
        valorDesconto = valorTaxa * 0.10;           // 10% de desconto
        valorKm = taxaKm * kmRodado;                // custo por Km rodado
        valorTotal = (valorTaxa - valorDesconto) + valorKm;

        // Saída formatada
        System.out.println("\nResumo do Aluguel:");
        System.out.println("Número de dias: " + dias);
        System.out.println("Quilometragem rodada: " + kmRodado + " km");
        System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Valor total do aluguel: R$ %.2f\n", valorTotal);

        entrada.close();
    }
}