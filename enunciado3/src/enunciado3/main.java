package enunciado3;

import java.util.Scanner;

public class main {
	

 public static void main(String[] args) {
	 
	 Scanner scanner = new Scanner(System.in);
	 
	 double n1, n2, n3;
	 
	 Scanner objScanner = new Scanner(System.in);
	 enunciado3 objEnunciado3 = new enunciado3();
	 enunciado3_1 objEnunciado3_1 = new enunciado3_1();
	 
	 System.out.println("informe o primeiro numero");
	 n1= objScanner.nextDouble();
	 
	 System.out.println("informe o primeiro numero");
	 n2= objScanner.nextDouble();
	 
	 System.out.println("informe o primeiro numero");
	 n3= objScanner.nextDouble();
	 
	 objEnunciado3_1.exibirMedia();
	 
	 double media = (n1 + n2 + n3) / 4;
	    if(media() > (7)) { 
			System.out.println("aprovado");
		}else {
	        System.out.println("reprovado");
		}
		
		System.out.println(" MÉDIA: " + media);
 }

private static int media() {
	
	return 0;
}
 }
