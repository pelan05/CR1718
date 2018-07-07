package UI;

import java.util.Scanner;
import logic.*;

public class InterfaceUI {


	Scanner sc;

	Diagnostico diagnostico;
	Nodulo nodulo;
	String temp;
	int tam;
	String choice;
	
	StringBuilder texto;
	String defaultPath, txt, string, path;
	

	LoadFile file;
	
	
	public InterfaceUI(Paciente paciente) {
		
		this.sc = new Scanner(System.in);
		this.temp = null;
		this.diagnostico = new Diagnostico();
		this.nodulo = new Nodulo();
		this.tam = 0;
		this.choice = "";
		
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
        		
        		this.file = new LoadFile(p, path);
        		
        		file.load(p);
        	}else{
            	pedeTudo(p);
        	}
    	
		
		}
	
	
	
	public void pedeTudo(Paciente p) {
		System.out.println("Qual o nome do paciente?");
		p.nome = sc.next();
		System.out.println("Qual a idade do paciente?");
		p.idade = sc.nextInt();
		
		System.out.println("Quantos nodulos tem o paciente?");										//NumNodulos
        tam = sc.nextInt();
        for(int i = 0; i < tam; i++) {
        	System.out.println("Tamanho do nodulo "+ i);
        	this.nodulo.setTam(sc.nextFloat());
        	System.out.println("O nodulo cresceu desde a ultima vez? (true/false)");
            this.nodulo.setGrowing(sc.nextBoolean());				//isGrowing
            diagnostico.addNodulo(nodulo);
        }
		
		System.out.println("Quantos testes positivos no 4phase/CT");
		diagnostico.fourPhaseCT = sc.nextInt();
		
		System.out.println("A biopsia deu resultado positivo? (true/false)");
		diagnostico.biopsia = sc.nextBoolean();
		
		System.out.println("Portal Spread cresceu? (true/false)");
		diagnostico.portalSpread = sc.nextBoolean();
		
		System.out.println("O doente tem doen�as associadas? (true/false)");
		diagnostico.hasAssociatedDiseases = sc.nextBoolean();
		
		System.out.println("O doente sente-se bem? (true/false)");
		diagnostico.feelsWell = sc.nextBoolean();
		
		System.out.println("O figado do paciente funciona normalmente? (true/false)");
		diagnostico.liverWorksNormally = sc.nextBoolean();
		
		System.out.println("O cancro espalhou-se? (true/false)");
		diagnostico.hasSpread = sc.nextBoolean();
		
		System.out.println("Ha dano severo no figado? (true/false)");
		diagnostico.severeLiverDamage = sc.nextBoolean();
		
		System.out.println("O paciente precisa de ajuda para tarefas mundanas? (true/false)");
		diagnostico.needsHelp = sc.nextBoolean();
	}
	
	
	public void imprimeResultado(Paciente p) {
		System.out.println("O paciente " + p.getNome() + " com " + p.getIdade() + " anos de idade tem Stage " + p.getStage() + " de BCLC.");
		System.out.println("O tratamento recomendado � " + p.getNomeTratamento());
		
	}
	
}
