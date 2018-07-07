package UI;

import java.util.Scanner;
import logic.*;

public class InterfaceUI {


	Scanner sc;

	Diagnostico diagnostico;
	String temp;
	int tam;
	String choice;
	float tempor;
	int temporary;
	
	StringBuilder texto;
	String defaultPath, txt, string, path;
	

	LoadFile file;
	
	
	public InterfaceUI(Paciente paciente) {
		
		this.sc = new Scanner(System.in);
		this.temp = null;
		this.diagnostico = new Diagnostico();
		this.tam = 0;
		this.choice = "";
		this.tempor = 0;
		
		this.texto = new StringBuilder();
		this.defaultPath = "ficheiros/";
		this.txt = ".txt";
		
		
	}
	
	public void start(Paciente p) {
			
			do{System.out.println("Qual o metodo de inicializacao?");
        	System.out.println("'ficheiro' ou 'manual'");
        	
        	choice = sc.next();
        	}while(!choice.equals("ficheiro") && !choice.equals("manual"));
        	
        	if(choice.equals("ficheiro")){
        		
        		System.out.println("Nome do ficheiro? (cuidado com Caps)");
        		string = sc.next();
        		
        		texto.append(defaultPath).append(string).append(txt);
        		path = texto.toString();
        		
        		this.file = new LoadFile(path);
        		
        		file.load(p);
        	}else{
            	pedeTudo(p);
        	}
    	
		
		}
	
	
	
	public void pedeTudo(Paciente p) {
		
		System.out.println("Qual o nome do paciente?");
		sc.nextLine();
		p.nome = sc.nextLine();
		
		do {
		System.out.println("Qual a idade do paciente?");
		temporary = sc.nextInt();
		}while(temporary < 0 || temporary > 120);
		p.idade = temporary;
		
		do {
		System.out.println("Quantos nodulos tem o paciente?");										//NumNodulos
        tam = sc.nextInt();
		}while(tam < 0 || tam > 8);
        
        for(int i = 0; i < tam; i++) {

        	System.out.println("Tamanho do nodulo "+ i);			//tamanho do nodulo,
        	sc.nextLine();											//com prevençao de ',' e '.'
        	temp = sc.nextLine();
        	temp = temp.replace(',', '.');
        	tempor = Float.valueOf(temp);
        	
        	do {
        	System.out.println("O nodulo cresceu desde a ultima vez? (true/false)");
            temp = sc.next();
        	}while(!temp.equals("true") && !temp.equals("false"));		//isGrowing
            
        	diagnostico.addNodulo(new Nodulo(tempor,Boolean.parseBoolean(temp)));
        }
		
		do{
        System.out.println("Quantos testes positivos no 4phase/CT");
		temporary = sc.nextInt();
		}while(temporary < 0 || temporary > 4);
		diagnostico.fourPhaseCT = temporary;
		
		do {
		System.out.println("A biopsia deu resultado positivo? (true/false)");
		temp = sc.next();
		}while(!temp.equals("true") && !temp.equals("false"));
		diagnostico.biopsia = Boolean.parseBoolean(temp);
		
		do {
		System.out.println("Portal Spread cresceu? (true/false)");
		temp = sc.next();
		}while(!temp.equals("true") && !temp.equals("false"));
		diagnostico.portalSpread = Boolean.parseBoolean(temp);
		
		do {
		System.out.println("O doente tem doenças associadas? (true/false)");
		temp = sc.next();
		}while(!temp.equals("true") && !temp.equals("false"));
		diagnostico.hasAssociatedDiseases = Boolean.parseBoolean(temp);

		do {
		System.out.println("O doente sente-se bem? (true/false)");
		temp = sc.next();
		}while(!temp.equals("true") && !temp.equals("false"));
		diagnostico.feelsWell = Boolean.parseBoolean(temp);
		
		do {
		System.out.println("O figado do paciente funciona normalmente? (true/false)");
		temp = sc.next();
		}while(!temp.equals("true") && !temp.equals("false"));
		diagnostico.liverWorksNormally = Boolean.parseBoolean(temp);
		
		do {
		System.out.println("O cancro espalhou-se? (true/false)");
		temp = sc.next();
		}while(!temp.equals("true") && !temp.equals("false"));
		diagnostico.hasSpread = Boolean.parseBoolean(temp);
	
		do {
		System.out.println("Ha dano severo no figado? (true/false)");
		temp = sc.next();
		}while(!temp.equals("true") && !temp.equals("false"));
		diagnostico.severeLiverDamage = Boolean.parseBoolean(temp);
		
		do {
		System.out.println("O paciente precisa de ajuda para tarefas mundanas? (true/false)");
		temp = sc.next();
		}while(!temp.equals("true") && !temp.equals("false"));
		diagnostico.needsHelp = Boolean.parseBoolean(temp);
		
		p.addDiagnostico(this.diagnostico);
	}
	
	
	public void imprimeResultado(Paciente p) {
		System.out.println("O paciente " + p.getNome() + " com " + p.getIdade() + " anos de idade tem Stage " + p.getStage() + " de BCLC.");
		System.out.println("O tratamento recomendado é " + p.getNomeTratamento());
		
	}
	
}
