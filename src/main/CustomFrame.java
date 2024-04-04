package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import suggestor.Suggestor;

public class CustomFrame extends JFrame{
	
	private static final long serialVersionUID = 5423209350584307172L;

	public CustomFrame() {
		super("Custom Input");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Digite algo:");
        JTextField textField = new JTextField(20);
        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> {
            String input = textField.getText();
            // Faça o que for necessário com a entrada
            System.out.println("Texto inserido: " + input);
            dispose(); // Fecha o JFrame
        });
        
        Suggestor s = new Suggestor(textField, this);

        panel.add(label);
        panel.add(textField);
        panel.add(okButton);
        add(panel);

        setLocationRelativeTo(null); // Centraliza o JFrame na tela
        setVisible(true);
	}
	
	public static void main(String args[]) {
		new CustomFrame();
	}

}
