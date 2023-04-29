package ex_repeticao;


import java.text.DecimalFormat;
import java.util.Scanner;

public class ex6 {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int contPessoas = 0, idade = 0;
		char op;
		int totalA = 0,
		totalB = 0,
		totalC = 0, 
		totalD = 0, 
		totalE = 0,
		somaIdade = 0;
		double mediaIdade = 0;
		double porcTotalA = 0, 
		porcTotalB = 0,
		porcTotalC = 0,
		porcTotalD = 0,
		porcTotalE = 0;
		
		DecimalFormat formataNum = new DecimalFormat("## 0.00");
		
		
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		
		while (idade != 0) {
			System.out.println("Deixe sua opnião sobre o filme: ");
			op = input.next().charAt(0);
			op = Character.toUpperCase(op);
			
			while (op != 'A' && op != 'B' && op != 'C' && op != 'D' && op != 'E') {
				System.out.println("Digite um caracter correto!");
				op = input.next().charAt(0);
				op = Character.toUpperCase(op);
				contPessoas--;
				
			}
			
			if (op == 'A') {
				totalA++;
			} else if (op == 'B') {
				totalB++;
			} else if (op == 'C') {
				totalC++;
			} else if (op == 'D') {
				totalD++;
			} else if (op == 'E') {
				totalE++;
			}
			
			contPessoas++;
			
			System.out.println("Digite sua idade: ");
			idade = input.nextInt();
			
			somaIdade += idade;
			
			
			
			
			
		}
		
		
		
		
		mediaIdade = somaIdade / contPessoas;
		porcTotalA = (double)totalA / (double)contPessoas * 100;
		porcTotalB = (double)totalB / (double)contPessoas * 100;
		porcTotalC = (double)totalC / (double)contPessoas * 100;
		porcTotalD = (double)totalD / (double)contPessoas * 100;
		porcTotalE = (double)totalE / (double)contPessoas * 100;
		
		System.out.println("A quantidade de pessoas que responderam à isso foi de: " + contPessoas);
		System.out.println("A média da idade das pessoas que "
				+ "responderam à essa pesquisa foi de: " + mediaIdade);
		
		
		System.out.println("Ótimo: " + formataNum.format(porcTotalA) + "%");
		System.out.println("Bom: " + formataNum.format(porcTotalB) + "%");
		System.out.println("Regular: " + formataNum.format(porcTotalC) + "%");
		System.out.println("Ruim: " + formataNum.format(porcTotalD) + "%");
		System.out.println("Péssimo: " + formataNum.format(porcTotalE) + "%");
		
		input.close();
	
	}
	
	
	

}

