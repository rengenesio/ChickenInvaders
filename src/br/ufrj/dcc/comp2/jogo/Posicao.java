package br.ufrj.dcc.comp2.jogo;

public class Posicao {
	private int  x = -1, y  = -1;

	public Posicao(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
