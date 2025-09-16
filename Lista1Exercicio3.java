

package lista1;

/*Crie um programa que leia o valor do dólar e faça a conversão em reais.
O usuário deverá inserir o valor da cotação atual do dólar (em reais) e o valor do produto (em dólar).
O programa deverá imprimir o valor em reais.   */

import java.util.Scanner;


public class Lista1Exercicio3 {

   
    public static void main(String[] args) {
        // Variaveis
        double cotacao, dolarProduto, realProduto ;
        
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Digite a cotacao atual do dolar: ");
        cotacao = entrada.nextDouble();
        System.out.print("Digite o preco do produto em dolar: ");
        dolarProduto = entrada.nextDouble();
        
        //Processamento
        realProduto = cotacao * dolarProduto ;
        
        //Saída
        System.out.println("O valor do produto em real e : " + realProduto);  
    }
    
}
