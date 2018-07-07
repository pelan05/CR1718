package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Panel3 extends JPanel {
	
	public Panel3() {
		JPanel  panel3 = new JPanel();
		JButton button = new JButton("AtPanel3");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.changeState(ViewState.FINAL_STATE);

			}

		});

		panel3.add(button);

		this.add(panel3);
	}

}
