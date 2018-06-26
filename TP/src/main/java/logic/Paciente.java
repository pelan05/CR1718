package logic;
//import java.util.*;

import java.util.ArrayList;

public class Paciente {
	public String nome;
	public int idade; 
	ArrayList <Diagnostico> diagnostico;
	ArrayList <Tratamento> tratamento;
	
	public Paciente() {
		//input nome & idade through GUI
		//temp
		nome = "Jose";
		idade = 43;
		//diagnostico.add(new Diagnostico());
		//tratamento.add(new Tratamento());
		
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
	
	public Tratamento getTratamento(int i) {
		return tratamento.get(i);
	}
	
	public void addTratamento() {
		this.tratamento.add(new Tratamento());
	}
	
	public int getTratamentos() {
		return tratamento.size();
	}
	
	
}
