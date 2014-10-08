package br.ufrj.dcc.comp2.jogo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public static final int RESOLUCAO_X = 800, 
					 RESOLUCAO_Y = 600;
	
	private static final String PATH_ICONE = new String ("./imagens/icone.jpg");
	
	/**
	 * 
	 */
	private Menu menu = new Menu();
	private static final long serialVersionUID = 1L;
	public TelaJogo telaJogo;
	
	public Janela (String titulo) {
		super(titulo);
		this.setSize(RESOLUCAO_X, RESOLUCAO_Y);
		this.setResizable(false);
		this.setIconImage(new ImageIcon(PATH_ICONE).getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new OuvinteJanela());
		
		this.telaJogo = new TelaJogo();
		this.add(telaJogo);
	
		this.setJMenuBar(menu.getMenuBar());
		
	}
	

}

