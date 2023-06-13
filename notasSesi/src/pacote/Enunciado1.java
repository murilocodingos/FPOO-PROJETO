package pacote;

import java.util.Scanner;

public class Enunciado1 {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		String planos;
		
		System.out.println("INFORME O PLANO: ");
		
		planos = objScanner.next();
		
	
		if(planos.equalsIgnoreCase("Básico")){
			System.out.println("Valor: R$150,00");
		}
		else if(planos.equalsIgnoreCase("Bronze")){
			System.out.println("Valor: R$220,00");
		}
		else if(planos.equalsIgnoreCase("Prata")){
			System.out.println("Valor: R$310,00"); 
			
		}
		else if(planos.equalsIgnoreCase("Ouro")){
			System.out.println("Valor: R$450,00");
		}
		
		else {
			System.out.println("PLANO NÃO RECONHECIDO");
		}

	}

}
