package logic;
//import java.util.*;

import java.util.ArrayList;

public class Paciente {
	public String nome;
	public int idade; 
	ArrayList <Diagnostico> diagnostico;
	public String nomeTratamento;
	public char stage;						//0, A, B, C, D
	
	public Paciente() {
		//input nome & idade through GUI
		//temp
		nome = "temp";
		idade = 0;
		diagnostico = null;
		nomeTratamento = "undefined";
		stage = '0';
		
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
		return diagnostico.get(i);
	}
	
	public void addDiagnostico(Diagnostico diag) {
		this.diagnostico.add(diag);
	}
	
	public int getDiagnosticos() {
		return diagnostico.size();
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
