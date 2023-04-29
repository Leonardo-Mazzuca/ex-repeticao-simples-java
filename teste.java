package ex_repeticao;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class teste {
	
	public static void main(String[] args) {
		
		int[] numeros1 = {1, 2 , 3, 4 ,5};
		// criação de uma lista
		
		int tamanhoArray = numeros1.length;
		System.out.println("Total da lista de números: " + tamanhoArray);

		
		String nome = "Leonardo";
		int tamanhoString = nome.length();
		System.out.println("Tamanho da string: " + tamanhoString);
		
		//coleção
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Leonardo");
		nomes.add("Paulo");
		nomes.add("Luiza");
		
		int tamanhoColecao = nomes.size();
		System.out.println("O tamanho da coleção é: " + tamanhoColecao);
		
	
		
		
		// ex com String
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma String: ");
        String str = scanner.nextLine();
        int tamanho = str.length();
        
       if (tamanho > 10) {
    	   System.out.println("Está palavra tem mais de 10 letras. ");
       } else {
    	   System.out.println("Está palavra tem menos de 10 letras. ");
       }
       

    
        System.out.print("Digite uma sequência de números separados por espaço: ");
        String numeros = scanner.nextLine();
        String[] numerosSeparados = numeros.split(" ");
        int soma = 0;
        for (String numero : numerosSeparados) {
        	// fazendo isso convertemos os elementos dessa variavél de String para Int
            soma += Integer.parseInt(numero);
         // o sinal de ":" percorre todos os itens de uma Array, assim como o método forEach()
        }
        System.out.println("A soma dos números é: " + soma);
        scanner.close();
        

//        O operador ternário é uma forma compacta de escrever um if-else.
        //Ele utiliza o sinal de dois pontos para separar a expressão que 
        //será executada quando a condição for verdadeira da expressão que 
        //será executada quando a condição for falsa. Veja um exemplo:
//
//        	int a = 10;
//        	int b = 20;
//
//        	// verifica se a é menor que b e atribui o resultado à variável menor
//        	int menor = (a < b) ? a : b;
//
//        	System.out.println("O menor número é " + menor);
		

		
		
		
		
	}

}
