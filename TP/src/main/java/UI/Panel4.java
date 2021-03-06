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
	
	
	public Panel4(Paciente paciente) {
		
		GridLayout layout = new GridLayout(6, 0, 5, 5);
		
		JPanel  panel4 = new JPanel();
		JLabel num1 = new JLabel("Nome: ");
		JLabel num2 = new JLabel(paciente.getNome());
		JLabel num3 = new JLabel("Idade: ");
		JLabel num4 = new JLabel(Integer.toString(paciente.getIdade()));
		JLabel num5 = new JLabel("Est�gio BCLC: ");
		JLabel num6 = new JLabel(paciente.returnStage());
		JLabel num7 = new JLabel("Tratamento Recomendado: ");
		JLabel num8 = new JLabel(paciente.getNomeTratamento());
		JButton button1 = new JButton("<Update>");
		JButton button = new JButton("<<Voltar ao In�cio>>");
		
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Main.changeState(ViewState.START_STATE);

			}

		});
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Main.changeState(ViewState.UPDATE_STATE);

			}

		});

		
		panel4.setLayout(layout);
		panel4.add(num1);
		panel4.add(num2);
		panel4.add(num3);
		panel4.add(num4);
		panel4.add(num5);
		panel4.add(num6);
		panel4.add(num7);
		panel4.add(num8);
		panel4.add(new JLabel(""));
		panel4.add(button1);
		panel4.add(new JLabel(""));
		panel4.add(button);

		this.add(panel4);
	}

}
