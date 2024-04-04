package suggestor;

import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Main {

	public Main(String info, String title) {
		JFrame frame = new JFrame();
		Label lblTitle = new Label(info);
		JTextField jTxtFldUserInput = new JTextField(8);
		JPanel panel = new JPanel();
				
		@SuppressWarnings("unused")
		Suggestor suggestor = new Suggestor(jTxtFldUserInput, frame);
		
		panel.setLayout(new GridLayout(2, 0));
		panel.add(lblTitle);
		panel.add(jTxtFldUserInput);
		
		frame.add(panel);
		frame.setTitle(title);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);;
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		
	}
	
	public static void main(String args[]) {
		@SuppressWarnings("unused")
		Main m = new Main("Digite uma Raça de Dungeons and Dragons", "Teste");
	}

}
