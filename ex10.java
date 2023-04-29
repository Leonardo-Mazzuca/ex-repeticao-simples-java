package ex_repeticao;

import java.util.Scanner;
import java.text.DecimalFormat;

//10. Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes
//dados:
//✓ Valor da dívida, valor do juros, quantidade de parcelas e valor da parcela.
//Os juros e a quantidade de parcelas seguem a tabela:

public class ex10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat formataNum = new DecimalFormat("R$ ### 0.00");

		double valorDivida = 0, valParc = 0, valJuros = 0, valTotalJuros = 0, total = 0;
		int quantParc = 1;
		int cont = 0, contTab5 = 0;

		System.out.println("Digite o valor inicial da dívida: ");
		valorDivida = input.nextDouble();

		while (quantParc == 1) {
			valJuros = 0;
			valParc = valorDivida;
			System.out.println("Total: " + valorDivida + " valor do juros: " + valJuros + " quantidade de parcelas: "
					+ quantParc + " Valor da parcela: " + valParc);

			while (quantParc <= 12) {

//				for (quantParc = 1; quantParc < 13; quantParc += 3) {
					for (contTab5 = 2; contTab5 <= 5; contTab5++) {
						valJuros = contTab5 * 5;
						
						if (quantParc == 1) {
							quantParc -= 1;
						}
						
						quantParc += 3;
					
						

						
						valTotalJuros = valorDivida * (valJuros / 100);
						total = valorDivida + valTotalJuros;
						valParc = total / quantParc;

						System.out.println("Total : " + formataNum.format(total) + " valor do juros: " + valJuros
								+ " quantidade de parcelas: " + quantParc + " Valor da parcela: "
								+ formataNum.format(valParc));
						}
					break;
					}
				
			break;
				
	
				
			}
				
		
		}
	}

		
	



 
