

package lista1;

/* Escrever um algoritmo que lê o público total de futebol e fornecer a renda do jogo,
sabendo-se que havia 4 tipos de ingressos assim distribuídos:
popular 10% a R$1,00, geral 50% a R$5,00, arquibancada 30% a R$10,00
e cadeiras 10% a R$ 20,00.    */

import java.util.Scanner;


public class Lista1Exercicio11 {
    
    public static void main(String[] args) {
        
        // Declaração das variáveis
        int publicoTotal;
        int popular, geral, arquibancada, cadeiras;
        int precoPopular, precoGeral, precoArquibancada, precoCadeiras;
        double renda;
        
        Scanner entrada = new Scanner(System.in);
            
            // Entrada de dados
            System.out.print("Digite o público total: ");
            publicoTotal = entrada.nextInt();
            
            // Definição dos preços
            precoPopular = 1;
            precoGeral = 5;
            precoArquibancada = 10;
            precoCadeiras = 20;
            
            // Cálculo das quantidades por tipo de ingresso
            popular = (int)(publicoTotal * 0.10);
            geral = (int)(publicoTotal * 0.50);
            arquibancada = (int)(publicoTotal * 0.30);
            cadeiras = publicoTotal - (popular + geral + arquibancada);
            
            // Cálculo da renda
            renda = (popular * precoPopular) +
                    (geral * precoGeral) +
                    (arquibancada * precoArquibancada) +
                    (cadeiras * precoCadeiras);
            
            // Saída
            System.out.println("Ingresso Popular: " + popular + " ----- R$ " + (popular * precoPopular));
            System.out.println("Ingresso Geral: " + geral + " -----R$ " + (geral * precoGeral));
            System.out.println("Ingresso Arquibancada: " + arquibancada + " ----- R$ " + (arquibancada * precoArquibancada));
            System.out.println("Ingresso Cadeiras: " + cadeiras + " ----- R$ " + (cadeiras * precoCadeiras));
            System.out.println("-------------------------------------");
            System.out.printf("Renda Total: R$ %.2f\n", renda);
    }
}

