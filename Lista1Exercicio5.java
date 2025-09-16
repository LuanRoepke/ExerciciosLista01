

package lista1;

/*Escreva um programa para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário. */

import java.util.Scanner;


public class Lista1Exercicio5 {

   
    public static void main(String[] args) {
        // Variaveis
        double salario, reajuste, salarioReajustado;
        
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Digite o salario atual: ");
        salario = entrada.nextDouble();
        System.out.print("Digite o reajuste ");
        reajuste = entrada.nextDouble();
        
        //Processamento
        salarioReajustado = salario * ((reajuste/100)+1) ;
        
        //Saída
        System.out.println("O salario ajustado fica em R$" + salarioReajustado);  
    }
    
}
