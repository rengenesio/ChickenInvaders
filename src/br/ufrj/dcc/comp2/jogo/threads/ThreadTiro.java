package br.ufrj.dcc.comp2.jogo.threads;

import br.ufrj.dcc.comp2.jogo.PainelJogo;

public class ThreadTiro extends Thread {
	private PainelJogo pj;
	
	public ThreadTiro(PainelJogo pj) {
		this.pj = pj;
	}
	
	public void run() {
		while (true) {
			this.pj.getNave().getTiro().anda(0, -1);
			if (this.pj.getNave().getTiro().saiuDaTela("cima")) {
				this.pj.getNave().setAtirando(false);
				this.stop();
			}

			try {
				sleep((long)20);
			} catch (InterruptedException e) {}
		}
	}
}