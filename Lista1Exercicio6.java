

package lista1;

/* O coração humano bate em média uma vez por segundo.
Desenvolver um programa para calcular e escrever quantas vezes o coração de uma 
pessoa baterá se viver X anos. */

import java.util.Scanner;


public class Lista1Exercicio6 {

   
    public static void main(String[] args) {
        // Variaveis
        double anos, batimentos;
        
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Digite a idade da pessoa: ");
        anos = entrada.nextDouble();
        
        //Processamento
        batimentos = anos * (60*60*24*365) ;
        
        //Saída
        System.out.println(" O coracao batera cerca de " + batimentos + "vezes");  
    }
    
}
