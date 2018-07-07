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
	
	
	JFileChooser fc;

	
	public Panel2() {
		
		boolean hasFicheiro = false;
		
		JLabel label1 = new JLabel("Escolher ficheiro:");
		
		this.fc = new JFileChooser();
		
		JPanel  panel2 = new JPanel();
		JButton button = new JButton("OK");
		JButton buttonFile = new JButton("Escolher Ficheiro");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				botao1();
			}

		});

		buttonFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				botao2();
			}
			
		});
		
		
		fc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				ficheiro();
			}

		});
		
		panel2.add(label1);
		panel2.add(fc);
		panel2.add(button);

		this.add(panel2);
		
	}


	public void botao1() {
		
		Main.changeState(ViewState.FINAL_STATE);
	
	}
	
	public void botao2() {

		fc.showDialog(this , "Abrir");
		
	}
	
	public void ficheiro() {

		new LoadFile(fc.getSelectedFile().getPath());
		
		
	}
	
}
