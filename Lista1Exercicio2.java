

package lista1;

/*Crie um programa que leia 3 números e faça a média entre eles.
Após o cálculo, imprima o valor na tela.  */

import java.util.Scanner;


public class Lista1Exercicio2 {

   
    public static void main(String[] args) {
        // Variaveis
        double num1, num2, num3;
        double  media;
        
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de dados
        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num3 = entrada.nextDouble();
        
        //Processamento
        media = (num1 + num2 + num3)/3 ;
        
        //Saída
        System.out.println("A media dos numeros inteiros: " + media);  
    }
    
}
