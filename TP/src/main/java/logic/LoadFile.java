package logic;

import java.io.*;

public class LoadFile {
	String path;
	Diagnostico diagnostico;
	Nodulo nodulo;
	String temp;
	int tam;
	float tempor;
	
	
	public LoadFile(String pat) {
		
		this.path = pat;
		this.temp = null;
		this.diagnostico = new Diagnostico();
		this.nodulo = new Nodulo();
		this.tam = 0;
		this.tempor = 0;
		
	}
	
	
	public void load(Paciente p) {
		 try{
	            FileReader fr = new FileReader(path);
	            BufferedReader br = new BufferedReader(fr);

	            temp = br.readLine();
	            p.nome = temp;														//nome
	            
	            temp = br.readLine();
	            p.idade = Integer.parseInt(temp);									//idade
	            
	            temp = br.readLine();												//NumNodulos
	            tam = Integer.parseInt(temp);
	            
	            for(int i = 0; i < tam; i++) {
	            	
	            	
	            	temp = br.readLine();
	            	this.nodulo.setTam(Float.valueOf(temp));						//tam
	            	
	            	temp = br.readLine();
		            this.nodulo.setGrowing(Boolean.parseBoolean(temp));				//isGrowing
		            
		            diagnostico.addNodulo(nodulo);
	            }
	            
	            temp = br.readLine();
	            diagnostico.fourPhaseCT = Integer.parseInt(temp);					//4PhaseCT
	            
	            temp = br.readLine();
	            diagnostico.biopsia = Boolean.parseBoolean(temp);					//biopsia
	            
	            temp = br.readLine();
	            diagnostico.portalSpread = Boolean.parseBoolean(temp);				//portalSpread
	            
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

	
	
}
