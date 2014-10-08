package br.ufrj.dcc.comp2.jogo;

public class LoopPrincipal extends Thread {
	
	private TelaJogo tela;
	
	public LoopPrincipal (TelaJogo t) {
		this.tela = t;
	}
	
	public void run() {
		
		while(true) {
			this.tela.repaint();
			
		}
	}
}
