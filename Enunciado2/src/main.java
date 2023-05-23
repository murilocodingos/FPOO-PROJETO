import java.util.Scanner;

public class main {
	

 public static void main(String[] args) {
	 
	 Scanner objScanner = new Scanner(System.in);
	 enunciado2 objEnunciado2 = new enunciado2();
	 enunciado2_1 objEnunciado2_1 = new enunciado2_1();
	 
	 System.out.println("INFORME O PRIMEIRO NÚMERO");
	 objEnunciado2_1.setN1(objScanner.nextInt());
	 
	 System.out.println("informe o segundo numero");
	 objEnunciado2_1.setN2(objScanner.nextInt());
	 
	 System.out.println("informe o segundo numero");
	 objEnunciado2_1.setN3(objScanner.nextInt());
	 
	 objEnunciado2_1.exibirMaior();
 }
 }
	 