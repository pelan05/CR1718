package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import logic.LoadFile;
import logic.Paciente;

@SuppressWarnings("serial")
public class Panel2 extends JPanel {
	
	
	JFileChooser fc;
	Paciente p;
	LoadFile file;
	
	public Panel2(Paciente paciente) {
		
		this.p = paciente;
		boolean hasFicheiro = false;
		
		JLabel label1 = new JLabel("Escolher ficheiro:");
		
		this.fc = new JFileChooser("C:\\Users\\pelan\\Documents\\GitHub\\CR1718\\TP\\ficheiros");
		JPanel  panel2 = new JPanel();
		JButton button = new JButton("OK");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				botao1();
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
		System.out.println("DEBUG: in botao1() in Panel2.java");
		
		
		
		Main.changeState(ViewState.FINAL_STATE);
	
	}
	
	
	public void ficheiro() {

		System.out.println("DEBUG: in ficheiro() in Panel2.java path: "+ fc.getSelectedFile().getPath());
		
		
		file = new LoadFile(fc.getSelectedFile().getPath());
		file.load(p);

	}
	
}
