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
	LoadFile file;
	
	public Panel2(Paciente paciente) {
		
		boolean hasFicheiro = false;
		
		JLabel label1 = new JLabel("Escolher ficheiro:");
		
		this.fc = new JFileChooser("C:\\Users\\pelan\\Documents\\GitHub\\CR1718\\TP\\ficheiros");
		JPanel  panel2 = new JPanel();
		JButton button = new JButton("Proxima Pagina");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Main.changeState(ViewState.FINAL_STATE);
			}

		});

		
		
		fc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				file = new LoadFile(fc.getSelectedFile().getPath());
				file.load(paciente);

				Main.changeState(ViewState.FINAL_STATE);
			}

		});
		
		panel2.add(label1);
		panel2.add(fc);
		panel2.add(button);

		this.add(panel2);
		
	}

	
	
	
}
