package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import logic.LoadFile;

@SuppressWarnings("serial")
public class Panel2 extends JPanel {
	
	
	public Panel2() {
		
		boolean hasFicheiro = false;
		
		JLabel label1 = new JLabel("Escolher ficheiro:");
		
		JFileChooser fc = new JFileChooser();
		

		JPanel  panel2 = new JPanel();
		JButton button = new JButton("AtPanel2");
		JButton buttonFile = new JButton("Escolher Ficheiro");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Main.changeState(ViewState.FINAL_STATE);

			}

		});

		buttonFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fc.showDialog(getPanel2() , "Abrir");
				
			}
			
		});
		
		
		fc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				File ficheiro = fc.getSelectedFile();
				
			}

		});
		
		panel2.add(label1);
		panel2.add(fc);
		panel2.add(button);

		this.add(panel2);
		
	}

	public JPanel getPanel2() {
		return this;
	}
	
}
