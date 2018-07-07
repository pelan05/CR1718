package UI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main {

	private static ViewState viewState;
	private static JPanel mpanel;
	private static JPanel panel1;
	private static JPanel panel2;
	private static JPanel panel3;
	private static JPanel panel4;
	private static JFrame frame;

	public Main() {

		frame = new JFrame();
		mpanel = new JPanel( new GridLayout(2,1,5,5) );
		panel1 = new Panel1();
		panel2 = new Panel2();
		panel3 = new Panel3();
		panel4 = new Panel4();

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


}
