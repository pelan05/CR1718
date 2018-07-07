package logic;
//import java.util.*;

import java.util.ArrayList;

public class Paciente {
	public String nome;
	public int idade; 
	public ArrayList<Diagnostico> historico;
	public String nomeTratamento;
	public char stage;							//0, A, B, C, D
	
	public Paciente() {
		nome = "temp";
		idade = 0;
		historico = new ArrayList <Diagnostico> ();
		nomeTratamento = "undefined";
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public Diagnostico getDiagnostico(int i) {
		return historico.get( i );
	}
	
	public int getDiagnosticos() {
		return historico.size();
	}
	
	public Diagnostico getLastDiag() {
		return historico.get( historico.size() - 1 );
	}
	
	public void addDiagnostico(Diagnostico diag) {
		this.historico.add( diag );
	}
	
	public int getSizeHistorico() {
		return historico.size();
	}

	public String getNomeTratamento() {
		return nomeTratamento;
	}

	public void setNomeTratamento (String nome) {
		this.nomeTratamento = nome;
	}

	public char getStage() {
		return stage;
	}

	public void setStage(char stage) {
		//verificação 0, A, B, C, D (char)
		//temp
		if (stage != '0' || stage != 'A' || stage != 'B' || stage != 'C' || stage != 'D')
			return;
		this.stage = stage;
	}

}
