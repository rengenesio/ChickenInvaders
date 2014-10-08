package br.ufrj.dcc.comp2.jogo;

import javax.swing.JFrame;

public class Jogo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Janela jogo = new Janela ("Space Invaders");
		jogo.setVisible(true);
		
		LoopPrincipal lp = new LoopPrincipal(jogo.telaJogo);
		lp.run();
	}

}
