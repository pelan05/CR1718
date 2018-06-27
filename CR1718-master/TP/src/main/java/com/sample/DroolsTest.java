package com.sample;

//import org.kie.api.KieServices;

//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;
import logic.*;
//import GUI.*;


public class DroolsTest {

	
	
    public static final void main(String[] args) {
        
    	Paciente paciente = new Paciente();
    	//Graphical gui = new Graphical();
    	String defaultPath = "ficheiros/paciente.txt";
    	
    	//gui da pull nisto
    	//e o path tem que ser escolhido na gui
    	//temp
    	new LoadFile(paciente, defaultPath);
    	/*
    	
    	try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");


        } catch (Throwable t) {
            t.printStackTrace();
        
        }
    	*/
    
    
    
    
    }


}
