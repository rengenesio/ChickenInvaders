package br.ufrj.dcc.comp2.jogo.threads;

import br.ufrj.dcc.comp2.jogo.PainelJogo;

public class ThreadRepaint extends Thread {
	private PainelJogo pj;

	public ThreadRepaint(PainelJogo pj) {
		this.pj = pj;
	}

	public synchronized void run() {
		this.setPriority(1);
		while (true) {
			this.pj.repaint();

			try {
				sleep((long) 5);
			} catch (InterruptedException e) {}
		}
	}
}
