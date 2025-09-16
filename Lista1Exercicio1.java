

package lista1;

import java.util.Scanner;


public class Lista1Exercicio1 {

   
    public static void main(String[] args) {
        // Variaveis
        int num1, num2, soma;
        
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de dados
        System.out.println("Digite o primeiro numero inteiro: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        num2 = entrada.nextInt();
        
        //Processamento
        soma = num1 + num2;
        
        //Saída
        System.out.println("A soma dos numeros inteiros: " + soma);  
    }
    
}
