
public class Enunciado1_1 {
	
	private int n1;
	private int n2;
	
	public void exibirMaior() {
		
		if(getN1() > getN2()) { 
			System.out.println("N1 � MAIOR QUE N2");
		}else {
	       System.out.println("N2 � MAIOR QUE N1");
	       
		}
	
	}

	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	

}
