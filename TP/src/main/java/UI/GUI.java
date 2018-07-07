package UI;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;



public class GUI {

    String[] options;
    String title;
    JDialog frame;
    JOptionPane optionPane;
    JTextPane textPane;
    boolean res;

    public GUI() {
        title = "Diagnóstico de Locomotivas";
        options = new String[3];
        options[0] = "Sim";
        options[1] = "Não";
        options[2] = "Sair";
        res = false;
        textPane = new JTextPane();

        textPane.setPreferredSize(new Dimension(400, 200));
        textPane.setText("Questão não defenida");
        frame = new JDialog();

        StyledDocument doc = textPane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);


        frame.setTitle(title);
        frame.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        optionPane = new JOptionPane();

        frame.setContentPane(optionPane);

    }

    public void DisplaySolution(String solution) {

        textPane.setText(solution);
        optionPane.showMessageDialog(frame,textPane,"Solução",JOptionPane.INFORMATION_MESSAGE);

    }



    public void DisplayOptionPane() {

        int resp = optionPane.showOptionDialog(frame, textPane, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        switch (resp) {
            case 0:
                res = true;
                return;
            case 1:
                res = false;
                return;
            case 2:
                System.exit(0);
            default:
                System.out.println("Erro no JOptionPane");
                System.exit(0);
        }
    }

    public JOptionPane getOptionPane() {
        return optionPane;
    }

    public void setOptionPane(JOptionPane optionPane) {
        if (optionPane == null)
            return;
        this.optionPane = optionPane;
        frame.setContentPane(optionPane);
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setOption(int index, String option) {
        if (index < 0 || index >= options.length)
            return;
        options[index] = option;
    }

    public void setOptionTrue(String option) {
        options[0] = option;
    }

    public void setOptionFalse(String option) {
        options[1] = option;
    }

    public void restOption() {
        options[0] = "Sim";
        options[1] = "Não";
        options[2] = "Sair";
    }

    public void setQuest(String quest) {
        textPane.setText(quest);
    }

    public boolean getRes() {
        return res;
    }
}
