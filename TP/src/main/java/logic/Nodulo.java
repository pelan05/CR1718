package logic;

public class Nodulo {
	
	public float tamanho;			//em cm
	public boolean isGrowing;		//positivo ou negativo
	
	public Nodulo(float tam, boolean is) {
		
		//pedir ambos through GUI
		//temp
		tamanho = tam;
		isGrowing = is;
		
	}
	
	public float getTam() {
		return tamanho;	
	}
	
	public void setTam(float t) {
		this.tamanho = t;
	}
	
	public boolean getGrowing() {
		return isGrowing;
	}
	
	public void setGrowing(boolean v) {
		this.isGrowing = v;
	}
	
	
	
}
