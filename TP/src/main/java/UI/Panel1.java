package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UI.ViewState;



@SuppressWarnings("serial")
public class Panel1 extends JPanel {


	
	public Panel1() {
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("Escolher modo de carregar Paciente");
		JButton button = new JButton("Manual");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.changeState(ViewState.MANUAL_STATE);

			}

		});
		
		JButton button2 = new JButton("Ficheiro");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.changeState(ViewState.FICHEIRO_STATE);

			}

		});	
	
		panel1.add(label1);
		panel1.add(button);
		panel1.add(button2);
		
		this.add(panel1);
	}

}
