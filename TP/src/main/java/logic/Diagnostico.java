package logic;


import java.util.ArrayList;

public class Diagnostico {
	
	public ArrayList <Nodulo> nodulo;
	public Data data;
	public boolean resultado;		//positivo ou negativo
	public int fourPhaseCT;			//0..4
	public boolean biopsia;			//positivo ou negativo
	
	public Diagnostico() {
		nodulo.add(new Nodulo());
		data = new Data();
		resultado = false;
		fourPhaseCT = 0;
		biopsia = false;		
	}

	
	
	public Nodulo getNodulo(int i) {
		return nodulo.get(i);
	}
	
	public void addNodulo(Nodulo nod) {
		this.nodulo.add(nod);
	}
	
	public int getNodulos() {
		return nodulo.size();
	}

	public Data getData() {
		return data;
	}
	
	public boolean getResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	public int getFourPhaseCT() {
		return fourPhaseCT;
	}

	public void setFourPhaseCT(int fourPhaseCT) {
		this.fourPhaseCT = fourPhaseCT;
	}

	public boolean getBiopsia() {
		return biopsia;
	}

	public void setBiopsia(boolean biopsia) {
		this.biopsia = biopsia;
	}
	
	
	
	
}
