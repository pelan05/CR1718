package logic;

public class Tratamento {
	
	public String nome;
	public char stage;						//0, A, B, C, D
	public boolean hasAssociatedDiseases;
	public boolean feelsWell;
	public boolean liverWorksNormally;
	public boolean hasSpread;
	public boolean severeLiverDamage;
	public boolean needsHelp;
	
	public Tratamento() {
		nome = "undefined";
		stage = '0';
		hasAssociatedDiseases = false;
		feelsWell = false;
		liverWorksNormally = false;
		hasSpread = false;
		severeLiverDamage = false;
		needsHelp = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getStage() {
		return stage;
	}

	public void setStage(char stage) {
		//verificação
		//temp
		this.stage = stage;
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
