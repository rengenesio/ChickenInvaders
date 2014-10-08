package br.ufrj.dcc.comp2.jogo;

import javax.swing.ImageIcon;

public class Nave extends ComponenteJogo {
	/* Constantes */
	public static final String PATH_IMAGEM = new String("./imagens/nave.png");
	private static final int MARGEM_INFERIOR = 70;
	
	private Tiro tiro;
	private boolean atirando = false;
	
	public Nave() {
		 super.posicao = new Posicao(100,Janela.RESOLUCAO_Y - new ImageIcon(PATH_IMAGEM).getIconHeight() - MARGEM_INFERIOR);
		 super.imagem.add(new ImageIcon(PATH_IMAGEM));
		 super.velocidade = 1;
	}
	
	public void Atira() {
		if (!atirando) {
			atirando = true;
			tiro = new Tiro(this.getPosicao().getX(), this.getPosicao().getY());
		}
	}
	
	public Tiro getTiro() {
		return this.tiro;
	}
	
	public boolean getAtirando() {
		return this.atirando;
	}
	
	public void setAtirando(boolean b) {
		this.atirando = b;
	}
}
