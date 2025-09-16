

package lista1;

/* Desenvolver um algoritmo para ler o nome, idade e peso de três pessoas.
Calcular e imprimir idade e o peso médio das três pessoas.    */

import java.util.Scanner;


public class Lista1Exercicio9 {
    
    public static void main(String[] args) {
        // Variaveis
        String 
        float F, C, mm, chuvaPolega;
        
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Digite a temperatura em Fahrenheit: ");
        F = entrada.nextFloat();
        System.out.print("Digite a quantidade em polegada: ");
        chuvaPolegada = entrada.nextFloat();
        
        //Processamento
        C = (5*F - 160)/9;
        mm = chuvaPolegada * polegada;
        
        
        //Saída
        System.out.println(" A temperatura em graus Celsius: " + C); 
        System.out.println(" A quantidade de chuva em milimetros: " + mm + " mm");
    }
    
}
