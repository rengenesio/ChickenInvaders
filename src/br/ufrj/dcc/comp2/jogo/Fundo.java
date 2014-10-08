package br.ufrj.dcc.comp2.jogo;

import javax.swing.ImageIcon;

public class Fundo extends ComponenteJogo {
	/* Constantes */
	public static final String PATH_IMAGEM = new String("./imagens/fundo.jpg");

	public Fundo() {
		super.posicao = new Posicao(0, 0);
		super.imagem.add(new ImageIcon(PATH_IMAGEM));
	}
}
