package br.ufrj.dcc.comp2.jogo.threads;

import br.ufrj.dcc.comp2.jogo.PainelJogo;

public class ThreadSpritesInvaders extends Thread {
	private PainelJogo pj;

	public ThreadSpritesInvaders(PainelJogo pj) {
		this.pj = pj;
	}

	public void run() {
		while (true) {
			for (int i = 0; i < 30; i++) {
				this.pj.getInvaders(i).setSprite();
			}
			try {
				sleep((long) 200);
			} catch (InterruptedException e) {}
		}
	}
}
