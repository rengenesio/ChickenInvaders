package br.ufrj.dcc.comp2.jogo;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class ComponenteJogo {
	protected Posicao posicao;
	protected ArrayList<ImageIcon> imagem = new ArrayList<ImageIcon>();
	protected int velocidade = 0;

	public void anda(int x, int y) {
		this.setX(x + this.getPosicao().getX());
		this.setY(y + this.getPosicao().getY());
	}

	public boolean saiuDaTela(String direcao) {
		if (direcao == "esquerda") {
			if (this.getPosicao().getX() > 0)
				return false;
			else
				return true;
		}

		if (direcao == "direita") {
			if (this.getPosicao().getX() < Janela.RESOLUCAO_X - imagem.get(0).getIconWidth())
				return false;
			else
				return true;
		}

		if (direcao == "cima") {
			if (this.getPosicao().getY() >= 0 - imagem.get(0).getIconHeight())
				return false;
			else
				return true;
		}

		if (direcao == "baixo") {
			if (this.getPosicao().getY() <= Janela.RESOLUCAO_Y)
				return false;
			else
				return true;
		}

		return false;
	}

	public void setX(int x) {
		this.posicao.setX(x);
	}

	public void setY(int y) {
		this.posicao.setY(y);
	}

	public Posicao getPosicao() {
		return this.posicao;
	}

	public ImageIcon getImagem(int i) {
		return this.imagem.get(i);
	}

	public int getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(int v) {
		this.velocidade = v;
	}
}
