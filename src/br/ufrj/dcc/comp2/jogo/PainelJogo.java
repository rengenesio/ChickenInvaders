package br.ufrj.dcc.comp2.jogo;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import br.ufrj.dcc.comp2.jogo.threads.ThreadEOuvinteTeclado;
import br.ufrj.dcc.comp2.jogo.threads.ThreadInvaders;
import br.ufrj.dcc.comp2.jogo.threads.ThreadRepaint;
import br.ufrj.dcc.comp2.jogo.threads.ThreadSpritesInvaders;

public class PainelJogo extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;

	private ArrayList<Invaders> invaders = new ArrayList<Invaders>();
	private Nave nave = new Nave();
	private Fundo fundo = new Fundo();
	private ThreadEOuvinteTeclado ot = new ThreadEOuvinteTeclado(this);

	public PainelJogo() {
		
		while(invaders.size() < 31) invaders.add(new Invaders());
		
		ot.start();
		new ThreadRepaint(this).start();
		new ThreadInvaders(this).start();
		new ThreadSpritesInvaders(this).start();
	}

	public synchronized void paintComponent(Graphics g) {
		g.drawImage(fundo.getImagem(0).getImage(), 0, 0, this);
		g.drawImage(nave.getImagem(0).getImage(), nave.getPosicao().getX(), nave
				.getPosicao().getY(), this);
		
		if (nave.getAtirando()) {
			g.drawImage(this.getNave().getTiro().getImagem(0).getImage(), nave.getTiro()
					.getPosicao().getX()+ (this.getNave().getImagem(0).getIconWidth()/2), nave.getTiro().getPosicao().getY(),
					this);
		}
		
		for (Invaders i : invaders) {
			g.drawImage(i.getImagem(i.getSprite()).getImage(),
			i.getPosicao().getX(), i.getPosicao().getY(), this);
		}
	}

	public Nave getNave() {
		return this.nave;
	}

	public PainelJogo getPainelJogo() {
		return this;
	}

	public ThreadEOuvinteTeclado getOuvinteTeclado() {
		return this.ot;
	}

	public Invaders getInvaders(int i) {
		return this.invaders.get(i);
	}
	
	public void addInvaders(int i, Invaders inv) {
		this.invaders.add(i, inv);
	}
	
	public ArrayList<Invaders> getArrayListInvaders() {
		return this.invaders;
	}
//	public int colidiu (ComponenteJogo a, ComponenteJogo b) {
//		if(a.getPosicao().getX())
//	}
}
