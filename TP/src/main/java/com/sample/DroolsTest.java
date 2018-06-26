package com.sample;

import org.kie.api.KieServices;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import logic.*;


/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

	
	
    public static final void main(String[] args) {
        
    	Paciente paciente = new Paciente();
    	//Graphical gui = new Graphical();
    	
    	
    	
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
