package pacote;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Enunciado3 {

	public static void main(String[] args) {
		Scanner objScanner =  new Scanner(System.in);
		String codigo;
		
		double salario = 0, total = 0, x, y;
		
		codigo =  JOptionPane.showInputDialog("DIGITE O C�DIGO:");
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("DIGITE SEU SAL�RIO:"));
		
		switch (codigo) {
		case "1":
			y = salario;
			x = y / 100;
			total = salario + (x * 50);
			JOptionPane.showInputDialog(null,"SEU CARGO � : ESCRITU�RIO  " + "SEU SALARIO ATUAL: " + total + "AUMENTO DE 50%");
			
			break;
			
		case "2":
			y = salario;
			x = y / 100;
			total = salario + (x * 35);
			JOptionPane.showInputDialog(null,"SEU CARGO �: SECRET�RIO" + "SEU SALARIO ATUAL: " + total + "  AUMENTO DE 35%");
			
			break;
			
		case "3":
			y = salario;
			x = y / 100;
			total = salario + (x * 20);
			JOptionPane.showInputDialog(null,"SEU CARGO �: CAIXA" + "SEU SALARIO ATUAL" + total + "AUMENTO DE 20%");
			
			break;
			
		case "4":
			y = salario;
			x = y / 100;
			total = salario + (x * 10);
			JOptionPane.showInputDialog(null,"SEU CARGO �: GERENTE" + "SEU SALARIO ATUAL" + total + "AUMENTO DE 10%");
			
			break;
			
		case "5":
			y = salario;
			x = y / 100;
			total = salario + (x * 0);
			JOptionPane.showInputDialog(null,"SEU CARGO �: DIRETOR" + "SEU SALARIO ATUAL" + total + "AUMENTO DE 0%");
			
			break;
			
		}
	

	}

}
