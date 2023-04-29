package ex_repeticao;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex8 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat formatNum = new DecimalFormat("R$ ### 0.00");
		
		double precoCarro = 0, total= 0;
		int percentual = 0;
		
		System.out.println("Digite o preço do carro: ");
		precoCarro = input.nextDouble();
		
		System.out.println("Preço do carro com compra a vista: " + precoCarro * 0.8);
		
		for (int parcela = 6; parcela <= 66; parcela +=6) {
			percentual +=3;
			total = precoCarro + (precoCarro * percentual  / 100);
			
			System.out.println("O preço do carro em" + parcela + "X é de" + formatNum.format(total) 
					+ " com parcelas de: " + formatNum.format(total/percentual));
			
		}
		
		
		
		
	}

}

