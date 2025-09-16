

package lista1;

/*Crie um programa que leia o número de horas trabalhadas no mês e o valor da hora.
O programa deverá imprimir o salário que o funcionário deverá receber, 
calculando o desconto de 6% do vale transporte do funcionário.    */

import java.util.Scanner;


public class Lista1Exercicio4 {

   
    public static void main(String[] args) {
        // Variaveis
        double horas, valorHora, salario;
        
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Digite a quantidade de horas trabalhada: ");
        horas = entrada.nextDouble();
        System.out.print("Digite o valor da hora trabalhada ");
        valorHora = entrada.nextDouble();
        
        //Processamento
        salario = (horas * valorHora) * 0.94d ;
        
        //Saída
        System.out.println("O salario previsto com o desconto de 6% : " + salario);  
    }
    
}
