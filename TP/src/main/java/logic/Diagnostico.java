package logic;


import java.util.ArrayList;

public class Diagnostico {
	
	public ArrayList <Nodulo> nodulo;
	public Data data;
	public boolean resultado;		//positivo ou negativo
	public int fourPhaseCT;			//0..4
	public boolean biopsia;			//positivo ou negativo
	public boolean portalSpread;	//true -> aumentou //false -> normal
	public boolean hasAssociatedDiseases;
	public boolean feelsWell;
	public boolean liverWorksNormally;
	public boolean hasSpread;
	public boolean severeLiverDamage;
	public boolean needsHelp;
	
	public Diagnostico() {
		nodulo = new ArrayList <Nodulo>();
		data = new Data();			//ATENÇÂO//data fica sempre com data do sistema, falta implementar SETs e implementar data no ficheiro
		resultado = false;
		fourPhaseCT = 0;
		biopsia = false;	
		
		portalSpread = false;
		hasAssociatedDiseases = false;
		feelsWell = false;
		liverWorksNormally = false;
		hasSpread = false;
		severeLiverDamage = false;
		needsHelp = false;
	}

	public boolean checkSizeNoduloMenor(float val) {		
		
		for(int i = 0; i < nodulo.size(); i++) {

			if(nodulo.get(i).getTam() < val) {
				return true;		
			}
		}
	return false;
	}
	
	public boolean checkSizeNoduloEntre(float valMen, float valMai) {		
		
		for(int i = 0; i < nodulo.size(); i++) {

			if(nodulo.get(i).getTam() >= valMen && nodulo.get(i).getTam() < valMai) {
				return true;		
			}
		}
	return false;
	}
	
	public boolean checkSizeNoduloMaior(float val) {		
		
		for(int i = 0; i < nodulo.size(); i++) {

			if(nodulo.get(i).getTam() >= val) {
				return true;		
			}
		}
	return false;
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
	
	public boolean getPortalSpread() {
		return portalSpread;
	}
	
	public void setPortalSpread( boolean port ) {
		this.portalSpread = port;
	}

	public boolean getHasAssociatedDiseases() {
		return hasAssociatedDiseases;
	}

	public void setHasAssociatedDiseases(boolean hasAssociatedDiseases) {
		this.hasAssociatedDiseases = hasAssociatedDiseases;
	}

	public boolean getFeelsWell() {
		return feelsWell;
	}

	public void setFeelsWell(boolean feelsWell) {
		this.feelsWell = feelsWell;
	}

	public boolean getLiverWorksNormally() {
		return liverWorksNormally;
	}

	public void setLiverWorksNormally(boolean liverWorksNormally) {
		this.liverWorksNormally = liverWorksNormally;
	}

	public boolean getHasSpread() {
		return hasSpread;
	}

	public void setHasSpread(boolean hasSpread) {
		this.hasSpread = hasSpread;
	}

	public boolean getSevereLiverDamage() {
		return severeLiverDamage;
	}

	public void setSevereLiverDamage(boolean severeLiverDamage) {
		this.severeLiverDamage = severeLiverDamage;
	}

	public boolean getNeedsHelp() {
		return needsHelp;
	}

	public void setNeedsHelp(boolean needsHelp) {
		this.needsHelp = needsHelp;
	}

	
	
}
