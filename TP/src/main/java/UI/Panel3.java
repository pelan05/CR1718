package UI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logic.Diagnostico;
import logic.Nodulo;
import logic.Paciente;


@SuppressWarnings("serial")
public class Panel3 extends JPanel {
	
	Paciente p;
	Float tempor;
	String temp;
	Diagnostico diagnostico;
	
	public Panel3(Paciente paciente) {
		
		temp = null;
		this.tempor = (float) 0;
		diagnostico = new Diagnostico();
		
		GridLayout layout = new GridLayout(17, 0, 5, 5);
		
		this.p = paciente;
		JPanel  panel3 = new JPanel();
		JButton button = new JButton("Pronto");
		JLabel num1 = new JLabel("Nome: ");
		JTextField texto1 = new JTextField("");
		JLabel num2 = new JLabel("Idade: ");
		JTextField texto2 = new JTextField("");
		JLabel num4 = new JLabel("Tamanho:");
		JTextField texto4 = new JTextField("");
		JLabel num5 = new JLabel("Crescimento?: ");
		JTextField texto5 = new JTextField("");
		JLabel num6 = new JLabel("4-Phase CT: ");
		JTextField texto6 = new JTextField("");
		JLabel num7 = new JLabel("Biopsia Positiva?: ");
		JTextField texto7 = new JTextField("");
		JLabel num8 = new JLabel("Portal Spread?: ");
		JTextField texto8 = new JTextField("");
		JLabel num9 = new JLabel("Doenças Associadas?: ");
		JTextField texto9 = new JTextField("");
		JLabel num10 = new JLabel("Sente-se bem?: ");
		JTextField texto10 = new JTextField("");
		JLabel num11 = new JLabel("liverWorksNormally: ");
		JTextField texto11 = new JTextField("");
		JLabel num12 = new JLabel("Cancro espalhou?: ");
		JTextField texto12 = new JTextField("");
		JLabel num13 = new JLabel("severeLiver: ");
		JTextField texto13 = new JTextField("");
		JLabel num14 = new JLabel("needsHelp: ");
		JTextField texto14 = new JTextField("");
		
		
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//apanhar valores JTextField:
				p.nome = texto1.getText();
				p.idade = Integer.parseInt(texto2.getText());
				temp = texto4.getText();
				temp = temp.replace(',', '.');
				tempor = Float.valueOf(temp);
				temp = texto5.getText();
				diagnostico.addNodulo(new Nodulo(tempor, Boolean.parseBoolean(temp)));
				diagnostico.fourPhaseCT = Integer.parseInt(texto6.getText());
				diagnostico.biopsia = Boolean.parseBoolean(texto7.getText());
				diagnostico.portalSpread = Boolean.parseBoolean(texto8.getText());
				diagnostico.hasAssociatedDiseases = Boolean.parseBoolean(texto9.getText());
				diagnostico.feelsWell = Boolean.parseBoolean(texto10.getText());
				diagnostico.liverWorksNormally = Boolean.parseBoolean(texto11.getText());
				diagnostico.hasSpread = Boolean.parseBoolean(texto12.getText());
				diagnostico.severeLiverDamage = Boolean.parseBoolean(texto13.getText());
				diagnostico.needsHelp = Boolean.parseBoolean(texto14.getText());
				
				p.addDiagnostico(diagnostico);
				
				Main.changeState(ViewState.FINAL_STATE);

			}

		});

		panel3.setLayout(layout);
		
		panel3.add(num1);
		panel3.add(texto1);
		panel3.add(num2);
		panel3.add(texto2);
		panel3.add(num4);
		panel3.add(texto4);
		panel3.add(num5);
		panel3.add(texto5);
		panel3.add(num6);
		panel3.add(texto6);
		panel3.add(num7);
		panel3.add(texto7);
		panel3.add(num8);
		panel3.add(texto8);
		panel3.add(num9);
		panel3.add(texto9);
		panel3.add(num10);
		panel3.add(texto10);
		panel3.add(num11);
		panel3.add(texto11);
		panel3.add(num12);
		panel3.add(texto12);
		panel3.add(num13);
		panel3.add(texto13);
		panel3.add(num14);
		panel3.add(texto14);

		panel3.add(new JLabel(""));
		panel3.add(button);
		

		this.add(panel3);
	}

	
}
