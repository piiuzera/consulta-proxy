package br.com.amarosystem.proxy.views;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class IndexView extends JFrame {
	private static final long serialVersionUID = -1025478208907309723L;
	
	public IndexView() {
		super("Consulta Proxy");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	
}
