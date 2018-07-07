package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Panel4 extends JPanel {
	
	public Panel4() {
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
