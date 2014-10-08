package br.ufrj.dcc.comp2.jogo;

import javax.swing.ImageIcon;

public class Tiro extends ComponenteJogo {
	/* Constantes */
	public static final String PATH_IMAGEM = new String("./imagens/tiro.png");

	public Tiro (int x, int y) {
		super.posicao = new Posicao(x, y);
		super.imagem.add(new ImageIcon(PATH_IMAGEM));
	}
}
