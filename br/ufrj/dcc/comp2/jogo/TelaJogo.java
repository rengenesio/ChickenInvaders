package br.ufrj.dcc.comp2.jogo;

import java.awt.Graphics;
import java.awt.Image;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaJogo extends JPanel {
	private static final String PATH_IMAGEM_FUNDO = new String("br/ufrj/dcc/comp2/jogo/imagens/fundo.jpg");
	private static final String PATH_IMAGEM_NAVE = new String("br/ufrj/dcc/comp2/jogo/imagens/nave.jpg");
	
	public HashMap<String, Image> imagens_map = new HashMap<String, Image>();	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	
	private Nave nave = new Nave();

	
	public void carregaImagem (String path) {
		Image img = new ImageIcon(path).getImage();
		imagens_map.put(path,img);
	}
	
	public Image getImagem (String path) {
		Image img = imagens_map.get(path);
		if (img == null) {
			carregaImagem(path);
		}
		return img;
		
	}
	
	public void paint(Graphics g){
		g.drawImage(new ImageIcon(PATH_IMAGEM_FUNDO).getImage(), 0, 0, this);
		g.drawImage(nave.getImagem().getImage(), nave.getX(), nave.getY(), this);
	}
	
	public void setNave(Nave nave) {
		this.nave = nave;
	}
	public Nave getNave() {
		return this.nave;
	}
}
