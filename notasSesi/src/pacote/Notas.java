package pacote;

public class Notas {

	public static void main(String[] args) {
		
		int nota1 = 9;
		
		int nota2 = 10;
		
		int nota3 = 15;
		
		if (nota1 > nota2 && nota1 > nota3) {
			
			System.out.println(nota1 + "Nota 1 � o maior n�mero");
			
		}else if(nota2 > nota1 && nota2 > nota3) {
			
			System.out.println(nota2 + "Nota 2 � o maior n�mero");
			
		}else {
			System.out.println(nota3 + " Nota 3 � o maior n�mero");
			
			}
		}

	}