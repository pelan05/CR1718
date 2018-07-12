package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import logic.*;
//import UI.InterfaceUI;
import UI.Main;
import UI.Panel4;

public class DroolsTest {

	public static final void main(String[] args){


		Paciente paciente = new Paciente();
		
		//InterfaceUI interfaceUi = new InterfaceUI(paciente);
		//interfaceUi.start(paciente);


		Main n = new Main(paciente);

		
		
		do {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			kSession.insert(paciente);

			kSession.fireUntilHalt();
			// kSession.fireAllRules();

		} catch (Throwable t) {
			//t.printStackTrace();

		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}

		}while(paciente.getStage() == 6);


	n.setPanel4(new Panel4(paciente));
	


	}
}
