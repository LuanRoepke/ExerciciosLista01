

package lista1;

/* Um fabricante de latas deseja desenvolver um programa para calcular o custo de 
uma lata cilíndrica de alumínio, sabendo-se que o custo do alumínio por m² é 
R$ 100,00. Leia o raio e a altura e escreva o valor do custo. 
Declare uma constante para o valor de PI e outra para o valor do metro quadrado.  */

import java.util.Scanner;


public class Lista1Exercicio7 {

    public static final float pi = 3.1415f ;
    public static final float valorMetro = 100f ;
    
    public static void main(String[] args) {
        // Variaveis
        float raio, altura, areaLata, custo;
        
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Digite o raio da lata: ");
        raio = entrada.nextFloat();
        System.out.print("Digite a altura da lata: ");
        altura = entrada.nextFloat();
        
        //Processamento
        areaLata = (2*pi*raio*altura) + ((2*pi*raio*raio)*2) ;
        custo = areaLata*valorMetro;
        //Saída
        System.out.println(" O valor para a produzir uma lata e R$" + custo);  
    }
    
}
