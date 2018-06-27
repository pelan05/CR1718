package logic;

import java.io.*;

public class LoadFile {

	Paciente p;
	String path;
	Diagnostico diagnostico;
	Nodulo nodulo;
	String temp;
	
	
	public LoadFile(Paciente d, String pat) {
		
		this.p = d;
		this.path = pat;
		this.temp = null;
		this.diagnostico = new Diagnostico();
		this.nodulo = new Nodulo();
		
		load();
		print();
	}
	
	
	public void load() {
		 try{
	            FileReader fr = new FileReader(path);
	            BufferedReader br = new BufferedReader(fr);

	            temp = br.readLine();
	            p.nome = temp;														//nome
	            
	            temp = br.readLine();
	            p.idade = Integer.parseInt(temp);									//idade
	            
	            temp = br.readLine();												//NumNodulos
	            for(int i = 0; i < Integer.parseInt(temp); i++) {
	            	temp = br.readLine();
	            	nodulo.tamanho = Float.valueOf(temp);							//TamNodulo
	            	temp = br.readLine();
		            nodulo.isGrowing = Boolean.parseBoolean(temp);					//isGrowing
		            diagnostico.addNodulo(nodulo);
	            }
	            
	            temp = br.readLine();
	            diagnostico.fourPhaseCT = Integer.parseInt(temp);					//4PhaseCT
	            
	            temp = br.readLine();
	            diagnostico.biopsia = Boolean.parseBoolean(temp);					//biopsia
	            
	            temp = br.readLine();
	            diagnostico.hasAssociatedDiseases = Boolean.parseBoolean(temp);		//hasAssociatedDiseases
	            
	            temp = br.readLine();
	            diagnostico.feelsWell = Boolean.parseBoolean(temp);					//feelsWell
	            
	            temp = br.readLine();
	            diagnostico.liverWorksNormally = Boolean.parseBoolean(temp);		//liverWorksNormally
	            
	            temp = br.readLine();
	            diagnostico.hasSpread = Boolean.parseBoolean(temp);					//hasSpread
	            
	            temp = br.readLine();
	            diagnostico.severeLiverDamage = Boolean.parseBoolean(temp);			//severeLiverDamage

	            temp = br.readLine();
	            diagnostico.needsHelp = Boolean.parseBoolean(temp);					//needsHelp

	            p.addDiagnostico(this.diagnostico);
	            br.close();
	            fr.close();
	        } catch (FileNotFoundException ex){
	            System.err.println("Unable to open file");
	        } catch (IOException ex){
	            System.err.println("Error reading file");
	        }
	    
	}
	
	
	public void print() {
		
		System.out.println(p.nome);
	}
	
	
	
}
