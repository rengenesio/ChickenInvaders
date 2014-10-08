package br.ufrj.dcc.comp2.jogo;

import javax.swing.ImageIcon;

public class Invaders extends ComponenteJogo {
	/* Constantes */
	private final static String PATH_IMAGEM_1 = new String("./imagens/invaders1.png");
	private final static String PATH_IMAGEM_2 = new String("./imagens/invaders2.png");
	
	private int sprite = (int)(Math.random() * 2);

	public Invaders() {
		super.posicao = new Posicao((int)(Math.random() * Janela.RESOLUCAO_X), -1*(int)(Math.random() * Janela.RESOLUCAO_Y));
		super.imagem.add(new ImageIcon(PATH_IMAGEM_1));
		super.imagem.add(new ImageIcon(PATH_IMAGEM_2));
		super.velocidade = 1;
	}

	public int getSprite() {
		return this.sprite;
	}

	public void setSprite() {
		if (sprite == 0)
			sprite = 1;
		else
			sprite = 0;
	}
}
