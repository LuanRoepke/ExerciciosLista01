

package lista1;

/* Faça um programa para executar as seguintes conversões: 
– Ler uma temperatura em Fahrenheit e imprimir o equivalente em Celsius 
C=(5F-160)/9. – Ler uma quantidade de chuva dada em polegadas e 
imprimir o equivalente em milímetros (1 polegada = 25,4 mm).
Declare uma constante para valor de 1 polegada em mm (milimetro_pol 25.4)   */

import java.util.Scanner;


public class Lista1Exercicio8 {

    public static final float polegada = 25.4f ;
    
    public static void main(String[] args) {
        // Variaveis
        float F, C, mm, chuvaPolegada;
        
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
