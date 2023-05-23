
public class enunciado2_1 {
	
	private int n1;
	private int n2;
	private int n3;
	
	public void exibirMedia() {
		
		if(getN1() > getN2()) { 
			System.out.println("N1 É MAIOR QUE N2");
		}else {
	        System.out.println("N2 É MAIOR QUE N1");
		}
	       
	    if(getN1() > getN3()) { 
	    	System.out.println("N1 É MAIOR QUE N3");
		}else {
		    System.out.println("N3 É MAIOR QUE N1");
	       
		}
	    if(getN2() > getN3()) { 
	    	System.out.println("N2 É MAIOR QUE N3");
		}else {
		    System.out.println("N3 É MAIOR QUE N2");
	       
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
	
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}

	public void exibirMaior() {
		// TODO Auto-generated method stub
		
	}

}