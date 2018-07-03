package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import logic.*;
import UI.InterfaceUI;
import java.util.*;

public class DroolsTest {

	
	
    public static final void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	Paciente paciente = new Paciente();
    	String defaultPathNovo = "ficheiros/paciente.txt";
    	String defaultPathOld = "ficheiros/paciente.txt";
    	InterfaceUI interfaceUi = new InterfaceUI(paciente);
    	LoadFile file = new LoadFile(paciente, defaultPathNovo);
    	String choice = "";
    	
    	
    	do{System.out.println("Carregar Paciente guardado?");
    	System.out.println("'sim' ou 'nao'");
    	
    	choice = sc.next();
    	}while(!choice.equals("sim") && !choice.equals("nao"));
    	
    	if(choice == "sim"){
    		file.loadAntigo();
    	}else{
    		do{System.out.println("Qual o metodo de inicializacao?");
        	System.out.println("'ficheiro' ou 'manual'");
        	
        	choice = sc.next();
        	}while(!choice.equals("ficheiro") && !choice.equals("manual"));
        	
        	if(choice == "ficheiro"){
        		file.load();
        	}else{
            	interfaceUi.pedeTudo();
        	}
    	}
    	
    	
    	
    	
    	
    	try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");


        } catch (Throwable t) {
            t.printStackTrace();
        
        }
    	
    
    
    
    
    }


}
