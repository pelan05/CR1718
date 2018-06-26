package logic;

public class Nodulo {
	
	public float tamanho;			//em cm
	public boolean isGrowing;		//positivo ou negativo
	
	public Nodulo() {
		
		//pedir ambos through GUI
		//temp
		tamanho = 1;
		isGrowing = false;
		
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
