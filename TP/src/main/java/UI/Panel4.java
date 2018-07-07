package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import logic.Paciente;


@SuppressWarnings("serial")
public class Panel4 extends JPanel {
	
	Paciente p;
	
	public Panel4(Paciente paciente) {
		
		this.p = paciente;
		JPanel  panel4 = new JPanel();
		JButton button = new JButton("AtPanel4");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.changeState(ViewState.START_STATE);

			}

		});

		panel4.add(button);

		this.add(panel4);
	}

}
