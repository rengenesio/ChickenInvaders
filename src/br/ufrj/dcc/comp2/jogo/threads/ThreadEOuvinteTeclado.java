package br.ufrj.dcc.comp2.jogo.threads;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import br.ufrj.dcc.comp2.jogo.PainelJogo;

public class ThreadEOuvinteTeclado extends Thread implements KeyListener {
	private String direcao = "parado";
	private PainelJogo pj;
	private boolean atira = false;
	
	public ThreadEOuvinteTeclado (PainelJogo pj) {
		this.pj = pj;
	}
	
	public void keyPressed(KeyEvent e) {
		int tecla = e.getKeyCode();
		switch (tecla) {
		case 32:
			this.atira = true;
			break;
		case 37:
			this.direcao = "esquerda";
			break;
		case 39:
			this.direcao = "direita";
			break;
		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		this.direcao = "parado";
		this.atira = false;
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void run() {
		while(true) {
			if(direcao == "esquerda") {
				if (!this.pj.getNave().saiuDaTela("esquerda")) {
					this.pj.getNave().anda(-1*this.pj.getNave().getVelocidade(), 0);
				}
			}
				
			else
				if(direcao == "direita") {
					if (!this.pj.getNave().saiuDaTela("direita")) {
						this.pj.getNave().anda(this.pj.getNave().getVelocidade(), 0);
					}
				}
					
			if(this.atira) {
				pj.getNave().Atira();
				new ThreadTiro(this.pj).start();
			}
			
			try {
				sleep((long)1);
			} catch (InterruptedException e) {}
		}
	}
}
