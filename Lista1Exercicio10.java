

package lista1;

/* Fazer um algoritmo que leia a idade de uma pessoa expressa em anos,
meses e dias e mostre-a apenas em dias.     */

import java.util.Scanner;


public class Lista1Exercicio10 {
    
    public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);
        
        // Declaração das variáveis
        int anos, meses, dias, totalDias;

        // Entrada de dados
        System.out.print("Digite sua idade em anos: ");
        anos = entrada.nextInt();

        System.out.print("Digite os meses: ");
        meses = entrada.nextInt();

        System.out.print("Digite os dias: ");
        dias = entrada.nextInt();

        // Cálculo da idade em dias
        totalDias = (anos * 365) + (meses * 30) + dias;

        // Saída
        System.out.println("Sua idade em dias é: " + totalDias);

        entrada.close();
    }
}