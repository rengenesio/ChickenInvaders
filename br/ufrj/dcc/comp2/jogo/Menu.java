package br.ufrj.dcc.comp2.jogo;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Menu extends JMenu {
	private JMenuBar menuBar;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Menu () {
		JMenu novo_jogo = new JMenu("Novo Jogo");
		JMenu pause = new JMenu("Pause");
		JMenu opcoes = new JMenu("Opções");	
		JMenu recordes = new JMenu("Recordes");
		JMenu sair = new JMenu("Sair");
		
		novo_jogo.addMenuListener(  
			new MenuListener() {  
				public void menuSelected(MenuEvent e) {  
					System.out.println("Novo Jogo");
				}  
	     		public void menuDeselected(MenuEvent e) {}  
				public void menuCanceled(MenuEvent e) {}
			}
		);
		
		pause.addMenuListener(  
			new MenuListener() {  
				public void menuSelected(MenuEvent e) {  
					System.out.println("Jogo Pausado");  
				}  
				public void menuDeselected(MenuEvent e) {}  
				public void menuCanceled(MenuEvent e) {}  
			}
		);
		
		opcoes.addMenuListener(  
			new MenuListener() {  
				public void menuSelected(MenuEvent e) {  
					System.out.println("Opcoes");  
				}  
				public void menuDeselected(MenuEvent e) {}  
				public void menuCanceled(MenuEvent e) {}  
			}
		);
		
		recordes.addMenuListener(  
			new MenuListener() {  
				public void menuSelected(MenuEvent e) {  
					System.out.println("Recordes");  
				}  
				public void menuDeselected(MenuEvent e) {}  
				public void menuCanceled(MenuEvent e) {}  
			}
		);
		
		sair.addMenuListener(  
			new MenuListener() {  
				public void menuSelected(MenuEvent e) {  
					System.out.println("Sair");  
				}  
				public void menuDeselected(MenuEvent e) {}  
				public void menuCanceled(MenuEvent e) {}  
			}
		);
		
		menuBar = new JMenuBar();
		menuBar.add(novo_jogo);
		menuBar.add(pause);
		menuBar.add(opcoes);
		menuBar.add(recordes);
		menuBar.add(sair);
	}
	
	public JMenuBar getMenuBar () {
		return this.menuBar;
	}
}
