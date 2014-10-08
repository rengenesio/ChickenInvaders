package br.ufrj.dcc.comp2.jogo.threads;

import br.ufrj.dcc.comp2.jogo.Invaders;
import br.ufrj.dcc.comp2.jogo.Janela;
import br.ufrj.dcc.comp2.jogo.PainelJogo;

public class ThreadInvaders extends Thread {
	private PainelJogo pj;

	public ThreadInvaders(PainelJogo pj) {
		this.pj = pj;
	}

	public synchronized void run() {
		this.setPriority(10);
		while (true) {
			
			for (Invaders s: this.pj.getArrayListInvaders()) {
				s.anda(0, this.pj.getInvaders(0).getVelocidade());
				if (s.saiuDaTela("baixo")) {
					s.setX((int)(Math.random() * Janela.RESOLUCAO_X));
					s.setY((-1)*(int)(Math.random() * Janela.RESOLUCAO_Y));
				}
			}

			try {
				sleep((long) 20);
			} catch (InterruptedException e) {}
		}
	}
}
