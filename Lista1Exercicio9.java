

package lista1;

/* Desenvolver um algoritmo para ler o nome, idade e peso de três pessoas.
Calcular e imprimir idade e o peso médio das três pessoas.    */

import java.util.Scanner;


public class Lista1Exercicio9 {
    
    public static void main(String[] args) {
        // Variaveis
        String nome1, nome2, nome3;
        int idade1, idade2, idade3, mediaIdade;
        float peso1, peso2, peso3, mediaPeso;
        
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Digite o primeiro nome: ");
        nome1 = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        idade1 = entrada.nextInt();
        System.out.print("Digite seu peso: ");
        peso1 = entrada.nextFloat();
        entrada.nextLine(); // limpa o buffer
        
        System.out.print("Digite o segundo nome: ");
        nome2 = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        idade2 = entrada.nextInt();
        System.out.print("Digite seu peso: ");
        peso2 = entrada.nextFloat();
        entrada.nextLine(); // limpa o buffer
        
        System.out.print("Digite o terceiro nome: ");
        nome3 = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        idade3 = entrada.nextInt();
        System.out.print("Digite seu peso: ");
        peso3 = entrada.nextFloat();
        entrada.nextLine(); // limpa o buffer
        
        //Processamento
        mediaIdade = (idade1+idade2+idade3)/3;
        mediaPeso = (peso1+peso2+peso3)/3;
        
        
        //Saída
        System.out.println("A media de idade do "+nome1+", "+ nome2+ ", " + nome3+ " e " + mediaIdade); 
        System.out.println("A media dos pesos e: "+ mediaPeso);
    }
    
}
