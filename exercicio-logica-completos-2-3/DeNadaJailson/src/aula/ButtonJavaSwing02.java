package aula;

import javax.swing.*;
import java.awt.event.*;

public class ButtonJavaSwing02 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Nome Arquivo");
		final JTextField tf = new JTextField("Eu sou o placeholder");
		tf.setBounds(50, 50, 150, 20);
		JButton b = new JButton("Clique aqui!");
		b.setBounds(50, 100, 100, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Bem-vindo");
			}
		});
		f.add(b); f.add(tf);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
