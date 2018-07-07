package UI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.Paciente;


@SuppressWarnings("serial")
public class Panel4 extends JPanel {
	
	Paciente p;
	
	public Panel4(Paciente paciente) {
		
		GridLayout layout = new GridLayout(2, 0, 5, 5);
		
		this.p = paciente;
		JPanel  panel4 = new JPanel();
		JLabel num1 = new JLabel("Nome: ");
		JLabel num2 = new JLabel(p.nome);
		JLabel num3 = new JLabel("Idade: ");
		JLabel num4 = new JLabel(Integer.toString(p.idade));
		JLabel num5 = new JLabel("Estágio BCLC: ");
		JLabel num6 = new JLabel();
		JLabel num7 = new JLabel("Tratamento Recomendado: ");
		JLabel num8 = new JLabel();
		JButton button = new JButton("<<Voltar ao Início>>");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.changeState(ViewState.START_STATE);

			}

		});

		
		panel4.setLayout(layout);
		panel4.add(button);

		this.add(panel4);
	}

}
