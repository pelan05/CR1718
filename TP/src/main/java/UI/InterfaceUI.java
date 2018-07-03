package UI;

import java.util.Scanner;

import logic.*;


public class InterfaceUI {


	Scanner sc;
	
	Paciente p;
	String path;
	Diagnostico diagnostico;
	Nodulo nodulo;
	String temp;
	int tam;
	
	
	public InterfaceUI(Paciente paciente) {
		
		this.sc = new Scanner(System.in);
		this.p = paciente;
		this.temp = null;
		this.diagnostico = new Diagnostico();
		this.nodulo = new Nodulo();
		this.tam = 0;
		
		
	}
	
	public void pedeTudo() {
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
		
		System.out.println("O doente tem doenças associadas? (true/false)");
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
	
	
	
}
