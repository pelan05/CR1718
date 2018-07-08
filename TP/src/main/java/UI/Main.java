package UI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.Paciente;


public class Main {

	private static ViewState viewState;
	private static JPanel mpanel;
	private static JPanel panel1;
	private static JPanel panel2;
	private static JPanel panel3;
	private static JPanel panel4;
	private static JFrame frame;

	public Main(Paciente p) {

		frame = new JFrame();
		mpanel = new JPanel();
		panel1 = new Panel1();
		panel2 = new Panel2(p);
		panel3 = new Panel3(p);
		panel4 = new Panel4(p);

		// Sets default state
		changeState(ViewState.START_STATE);

		frame.setSize(1000, 900);
		frame.add(mpanel);
		frame.setVisible(true);

	}


	public static void changeState(ViewState state) {
		viewState = state;

		switch (state) {
		case START_STATE:
			mpanel.removeAll();
			mpanel.add(panel1);
			mpanel.revalidate();
			mpanel.repaint();
			break;
		case FICHEIRO_STATE:
			mpanel.removeAll();
			mpanel.add(panel2);
			mpanel.revalidate();
			mpanel.repaint();
			break;
		case MANUAL_STATE:
			mpanel.removeAll();
			mpanel.add(panel3);
			mpanel.revalidate();
			mpanel.repaint();
			break;
		case FINAL_STATE:
			mpanel.removeAll();
			mpanel.add(panel4);
			mpanel.revalidate();
			mpanel.repaint();
			break;
		default:
			System.out.println("UNKNOWN STATE!");
			break;
		}
	}


	public int getState() {
		switch (this.viewState) {
		case START_STATE:
			return 1;
		case FICHEIRO_STATE:
			return 2;
		case MANUAL_STATE:
			return 3;
		case FINAL_STATE:
			return 4;
		default:
			return 0;
	}
	
}
}
