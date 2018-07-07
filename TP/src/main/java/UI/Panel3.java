package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logic.Paciente;


@SuppressWarnings("serial")
public class Panel3 extends JPanel {
	
	Paciente p;
	
	public Panel3(Paciente paciente) {
		
		this.p = paciente;
		JPanel  panel3 = new JPanel();
		JButton button = new JButton("AtPanel3");
		JTextField texto1 = new JTextField("ola");
		JTextField texto2 = new JTextField(" ");
		JTextField texto3 = new JTextField(" ola .");
		JTextField texto4 = new JTextField();
		JTextField texto5 = new JTextField();
		JTextField texto6 = new JTextField();
		JTextField texto7 = new JTextField();
		JTextField texto8 = new JTextField();
		JTextField texto9 = new JTextField();
		JTextField texto10 = new JTextField();
		JTextField texto11 = new JTextField();
		JTextField texto12 = new JTextField();
		JTextField texto13 = new JTextField();
		JTextField texto14 = new JTextField();
		
		
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.changeState(ViewState.FINAL_STATE);

			}

		});

		panel3.add(texto1);
		panel3.add(texto2);
		panel3.add(texto3);
		panel3.add(button);
		

		this.add(panel3);
	}

}
