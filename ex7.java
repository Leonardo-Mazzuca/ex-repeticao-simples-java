package ex_repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;


public class ex7 {
	
	public static void main(String[] args) {
		
		double nota = 0,nota1 = 0, nota2 = 0, nota3 = 0, notaTotal = 0, somaNota = 0;
		int aluno = 0,  matricula = 0, frequencia = 0;
		int totAlunoAp = 0, totAlunoRe = 0, totAlunoReFa = 0; 
	
		
		
		Scanner input = new Scanner(System.in);
		DecimalFormat formataNum = new DecimalFormat("## 0.00");
		
		
		
		
		for (aluno = 1; aluno <= 10; aluno++) {
			
			System.out.println("Digite o número da matrícula do " + aluno +  "° aluno:");
			matricula = input.nextInt();
			
			
			System.out.println("Digite a frequência do " + aluno + "° aluno:");
			frequencia = input.nextInt();
			
		
			for (int cont = 1; cont <= 3; cont++) {
				System.out.println("Digite a "+ cont + "° Nota: ");
				nota = input.nextDouble();
				if (cont == 1) {
					nota1 = nota;
				} else if (cont ==2) {
					nota2 = nota;
				} else if (cont == 3) {
					nota3 = nota;
				}
				
				
				}
			
		
			
			somaNota  = nota1 + nota2 + nota3;
			notaTotal = somaNota / 3;
			
			
			if (frequencia > 40 && notaTotal > 6) {	
				System.out.println("Nota total do " + aluno + "° aluno: " + formataNum.format(notaTotal));
				System.out.println("Frequencia das aulas do " + aluno + "° aluno: " + frequencia);
				System.out.println("Número da matrícula do  " + aluno + "° aluno: " + matricula );
				System.out.println(aluno + "° aluno foi aprovado.");	
				totAlunoAp++;
				
			} else if (frequencia > 40 && notaTotal < 6) {
			
			
			System.out.println("Nota total do " + aluno + "° aluno: " + formataNum.format(notaTotal));
			System.out.println("Frequencia das aulas do " + aluno + "° aluno: " + frequencia);
			System.out.println("Número da matrícula do  " + aluno + "° aluno: " + matricula );
			System.out.println("Reprovado por nota total abaixo de 6.");	
			totAlunoRe++;
			
			} else if (frequencia < 40 && notaTotal > 6){
				
				System.out.println("Nota total do " + aluno + "° aluno: " + formataNum.format(notaTotal));
				System.out.println("Frequencia das aulas do " + aluno + "° aluno: " + frequencia);
				System.out.println("Número da matrícula do  " + aluno + "° aluno: " + matricula );
				System.out.println("Reprovado por número de frequencia baixa.");
				totAlunoReFa++;
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		
		System.out.println("Total de aluno aprovados: " + totAlunoAp);
		System.out.println("Total de alunos reprovados: " + totAlunoRe);
		System.out.println("Total de alunos reprovados por faltas: " + totAlunoReFa);
		
	}

}

