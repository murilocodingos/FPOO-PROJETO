import java.util.Scanner;

public class main {
	

 public static void main(String[] args) {

	 
	 Scanner objScanner = new Scanner(System.in);
	 enun1 objEnunciado1 = new enun1();
	 Enunciado1_1 objEnunciado1_1 = new Enunciado1_1();
	 
	 int n1, n2;
	 System.out.println("INFORME O PRIMEIRO NUMERO");
	 n1 = objScanner.nextint();
	 System.out.println("INFORME O SEGUNDO NUMERO");
	 n2 = objScanner.nextint();
	 objEnunciado1.exibirMaior();
}
}

