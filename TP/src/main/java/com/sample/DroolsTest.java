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
    	String defaultPath = "ficheiros/paciente.txt";
    	InterfaceUI interfaceUi;
    	String choice;
    	
    	
    	do{System.out.println("Qual o metodo de inicializacao?");
    	System.out.println("'ficheiro' ou 'manual'");
    	
    	choice = sc.nextLine();
    	}while(choice != "ficheiro" || choice != "manual");
    	
    	if(choice == "ficheiro"){
    		new LoadFile(paciente, defaultPath);
    	}else {
    		new InterfaceUI(paciente);
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
