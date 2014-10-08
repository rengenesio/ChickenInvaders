package br.ufrj.dcc.comp2.jogo;

import javax.swing.ImageIcon;

public class ComponenteJogo {
	private int x, y;
	
	private ImageIcon imagem;
	
	public ComponenteJogo() {
		
	}

	public void anda (int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public int getX () {
		return this.x;
	}
	
	public int getY () {
		return this.y;
	}

	public ImageIcon getImagem() {
		return imagem;
	}

	public void setImagem(ImageIcon imagem) {
		this.imagem = imagem;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
