package aula;

import javax.swing.*;

public class ButtonJavaSwing {
	
	public static void main(String[]args) {
		JFrame f = new JFrame("Testando");
		JButton b = new JButton("Aperte aqui");
		b.setBounds(50, 100, 105, 30);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
}  
	

