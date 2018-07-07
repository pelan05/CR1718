package UI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logic.Paciente;


@SuppressWarnings("serial")
public class Panel3 extends JPanel {
	
	Paciente p;
	
	public Panel3(Paciente paciente) {
		
		GridLayout layout = new GridLayout(17, 0, 5, 5);
		
		this.p = paciente;
		JPanel  panel3 = new JPanel();
		JButton button = new JButton("Pronto");
		JLabel num1 = new JLabel("Nome: ");
		JTextField texto1 = new JTextField("");
		JLabel num2 = new JLabel("Idade: ");
		JTextField texto2 = new JTextField("");
		JLabel num3 = new JLabel("Nodulo: ");
		JTextField texto3 = new JTextField("");
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
				Main.changeState(ViewState.FINAL_STATE);

			}

		});

		panel3.setLayout(layout);
		
		panel3.add(num1);
		panel3.add(texto1);
		panel3.add(num2);
		panel3.add(texto2);
		panel3.add(num3);
		panel3.add(texto3);
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
