package br.ufrj.dcc.comp2.jogo;

import java.awt.event.*;

public class OuvinteJanela implements WindowListener {
	public void windowActivated(WindowEvent event) {
		// TODO Auto-generated method stub
	}

	public void windowClosed(WindowEvent event) {
		// TODO Auto-generated method stub
	}

	public void windowClosing(WindowEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Encerra o jogo");
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Pausa o jogo");
	}

	public void windowDeiconified(WindowEvent event) {
		// TODO Auto-generated method stub
	}

	public void windowIconified(WindowEvent event) {
		// TODO Auto-generated method stub
	}

	public void windowOpened(WindowEvent event) {
		// TODO Auto-generated method stub
	}
}
