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
		diagnostico.add(new Diagnostico());
		
	}
	
	
	
	
}
