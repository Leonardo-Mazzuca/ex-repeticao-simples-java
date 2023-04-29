package ex_repeticao;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex10Alt {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat formataNum = new DecimalFormat("R$ ### 0.00");

		
		double valDivida = 0, juros = 0,
		valJuros = 0, 
		valParcela = 0,
		total = 0;
		
		int parcela = 1;
		
		System.out.println("Digite o valor inicial da dívida: ");
		valDivida = input.nextDouble();
		
		while (true) {
			
			juros = (5/3) * parcela + 5;
			
			if (parcela == 1) {
				juros = 0;
			}
			
			valJuros = valDivida * (juros/100);
			total = valDivida + valJuros;
			valParcela = total / parcela;
			
			System.out.println("Total : " + formataNum.format(total) + 
					" valor do juros: " + valJuros + " quantidade de parcelas: "
					+ parcela + " Valor da parcela: " + formataNum.format(valParcela));
			
			if(parcela == 1) {
				parcela -= 1;
				parcela += 3;
				
			}
			
			if (parcela > 12) {
				break;
			}
			
			break;
			
		
			
			
		}
		
		
	}
}
	
	


