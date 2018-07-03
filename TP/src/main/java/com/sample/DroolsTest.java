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
    	InterfaceUI interfaceUi = new InterfaceUI(paciente);
    	
    	interfaceUi.start(paciente);
    	
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
