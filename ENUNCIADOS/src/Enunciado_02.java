
import java.util.Scanner;

public class Enunciado_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("INFORME O PRIMEIRO N�MERO:");
		n1 = scanner.nextInt();
		System.out.println("INFORME O SEGUNDO N�MERO:");
		n2 = scanner.nextInt();
		System.out.println("INFORME O TERCEIRO N�MERO:");
		n3 = scanner.nextInt();
		
		if(n1 > n2){
			if(n1 > n3) {
				System.out.println("O N1 � O MAIOR N�MERO: " + n1);	
			}
		}else {
			if(n2 > n1){
				if(n2 >n3) {
					System.out.println("O N2 � O MAIOR N�MERO: " + n2);
				}
			}
		}
			
		if(n3 >n1){
			
			if(n3 >n2) {
			System.out.println("O N3 � O MAIOR N�MERO: " + n3);
	

			}
		}
	}

}








