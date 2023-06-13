package pacote;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Media {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			String nomeAluno, disciplina;
			double media;
			
			double nota1;
			
			double nota2;
			
			double nota3;
			
			double nota4;
			
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("INFORME A PRIMEIRA NOTA"));
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("INFORME A SEGUNDA NOTA"));
			nota3 = Double.parseDouble(JOptionPane.showInputDialog("INFORME A TERCEIRA NOTA"));
			nota4 = Double.parseDouble(JOptionPane.showInputDialog("INFORME A QUARTA NOTA"));
			
			System.out.println("####---- BEM VINDO AO PROGRAMA DE MÉDIA ----####: ");
			
			System.out.println("INFORME O NOME DO ALUNO: ");
			nomeAluno = scanner.next();

			System.out.println("INFORME A DISCIPLINA: ");
			disciplina = scanner.next();
			
			media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			System.out.println("NOME: " + nomeAluno + " MÉDIA: " + media);
			
			if (media > 7) {
				System.out.println("ALUNO APROVADO");
				
			}else if (media >=5 && media <=7) {
				System.out.println("ALUNO DE RECUPERAÇÃO");
				}
			
			else {
				System.out.println("ALUNO REPROVADO");
			}
			
			System.out.println("####---- OBRIGADO POR UTILIZAR O PROGRAMA DE MÉDIA ----####");
			
			}
		
		}
	

