package ex_repeticao;

//9. Construa um programa que calcule e apresente o total da compra realizada pelo cliente em uma
//loja. São fornecidos para o programa, o preço da etiqueta (PE) de cada um dos produtos comprados
//e, com a compra encerrada, a condição de pagamento escolhida pelo cliente (CP). Utilize para os
//cálculos a tabela de condições de pagamento a seguir:
//Código da condição
//de pagamento
//Condição de pagamento
//1 À vista em dinheiro ou cheque, com 10% de desconto
//2 À vista com cartão de crédito, com 5% de desconto
//3 Em 2 vezes, preço normal de etiqueta sem juros
//4 Em 3 vezes, preço de etiqueta com acréscimo de 10%

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat formataNum = new DecimalFormat("R$ ### 0.00");
		
		// somaPreco = 0,
		
		double precoProdutoUni = 0, total = 0,
		 faturaTotal = 0, precoTotal = 0, precoProdutoMais= 0;
		
		int  quantProduto = 0,
		totClientesMais = 0,
		totClientesUni = 0,
		formPagamento = 0;
		int contClientes =0;
		
		
			
		String resp = "Sim";

		while (resp.equalsIgnoreCase("Sim")) {
			
			contClientes += 1;
			precoProdutoUni = 0;
			precoTotal = 0;
			
			
			System.out.println("Cadastrar " + contClientes + "° cliente.");
			
			

			System.out.println("Digite a quantidade de produtos: ");
			quantProduto = input.nextInt();

			// validação para mais de um produto
			while (quantProduto > 1) {
				for (int i = 1; i <= quantProduto; i++) {
					System.out.println("Digite o preço do " + i + "° produto: ");
					precoProdutoMais = input.nextDouble();
					precoTotal += precoProdutoMais;
				}
				
//				preco = somaPreco;

				System.out.println("Insira a forma de pagamento: ");
				formPagamento = input.nextInt();

				while (formPagamento < 1 || formPagamento > 4) {
					System.out.println("Digite 1,2,3 ou 4: ");
					formPagamento = input.nextInt();
				}

				if (formPagamento == 1) {
					System.out.println("Preço total: " + formataNum.format(precoTotal * 0.9));
				} else if (formPagamento == 2) {
					System.out.println("Preço total: " + formataNum.format(precoTotal * 0.95));
				} else if (formPagamento == 3) {
					System.out.println("Preço total: " + formataNum.format(precoTotal));
				} else if (formPagamento == 4) {
					System.out.println("Preço total: " + formataNum.format(precoTotal + (precoTotal * 0.9)));
				}

				totClientesMais++;
				faturaTotal += precoTotal;
				
				break;

			}

			// validação para 1 produto
			while (quantProduto == 1) {

				System.out.println("Digite o preço do produto: ");
				precoProdutoUni = input.nextDouble();

				System.out.println("Insira a forma de pagamento: ");
				formPagamento = input.nextInt();

				while (formPagamento < 1 || formPagamento > 4) {
					System.out.println("Digite 1,2,3 ou 4: ");
					formPagamento = input.nextInt();
				}

				if (formPagamento == 1) {
					System.out.println("Preço total: " + formataNum.format(precoProdutoUni * 0.9));
				} else if (formPagamento == 2) {
					System.out.println("Preço total: " + formataNum.format(precoProdutoUni * 0.95));
				} else if (formPagamento == 3) {
					System.out.println("Preço total: " + formataNum.format(precoProdutoUni));
				} else if (formPagamento == 4) {
					System.out.println("Preço total: " + formataNum.format(precoProdutoUni + (precoProdutoUni * 0.9)));
				}

				totClientesUni++;
				faturaTotal += precoProdutoUni;

				break;

			}
			
			
//			contClientes++;
			System.out.println("Deseja cadastrar um novo cliente?");
			resp = input.next();
//			
//			while (true) {
//			    System.out.println("Deseja cadastrar um novo cliente?");
//			    String resp = input.nextLine();
//			    if (resp.length() > 0 && (resp.equalsIgnoreCase("sim") || resp.equalsIgnoreCase("não"))) {
//			        break;
//			    } else {
//			        System.out.println("Resposta inválida. Digite sim ou não.");
//			    }
//			}

	

			while (!(resp.equalsIgnoreCase("Sim")) && !(resp.equalsIgnoreCase("Não"))) {
				System.out.println("Cadastrar cliente sim/não?");
				resp = input.next();
				break;
			}


		}

		System.out.println("Total de clientes: " + contClientes);
		System.out.println("Total faturado: " + formataNum.format(faturaTotal));
		System.out.println("Total de clientes que compraram mais de um produto: " + totClientesMais);
		System.out.println("Total de clientes que compraram apenas um produto: " + totClientesUni);

	}

}

