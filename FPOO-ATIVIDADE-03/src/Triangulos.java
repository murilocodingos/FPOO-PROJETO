import java.util.Scanner;

public class Triangulos {
	
	Scanner scanner = new Scanner(System.in);

	int a;
	int b;
	int c;
	
	/* SEM OPERADORES L�GICOS */
	public void verificarTriangulos() {
		
	System.out.println("INFORME O PONTO A");
	a = scanner.nextInt();
	
	System.out.println("INFORME O PONTO B");
	b = scanner.nextInt();
	
	System.out.println("INFORME O PONTO B");
	c = scanner.nextInt();
	
	if(a == b) {
        if(a == c) {
        	System.out.println("OS PONTOS FORMAM UM TRI�NGULO EQUIL�TERO");
        }
        
        }
	
	if(a == b) {
        if(a != c) {
        	System.out.println("OS PONTOS FORMAM UM TRI�NGULO ISOSC�LES");
        }

	}
	if(a != b ){
        if(a != c) {
        	if (b != c) {
        	}
        	
        	if((a == b) && (a == c)) {
    			System.out.println("OS PONTOS FORMAM UM TRI�NGULO EQUIL�TERO");
    		}
    		
    		if((a == b) && (a != c)) {
    			System.out.println("OS PONTOS FORMAM UM TRI�NGULO ISOSC�LES");
    		}
        	
    		if((a != b) && (a != c) && (b != c)) {
    			System.out.println("OS PONTOS FORMAM UM TRI�NGULO ESCALENO");
    			}
		
        	}//FIM DA CLASSE MaiorValor

		}
	}
}