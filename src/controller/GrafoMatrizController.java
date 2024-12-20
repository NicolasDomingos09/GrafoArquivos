package controller;

import model.estrutura.grafo.GrafoMatriz;

public class GrafoMatrizController {
	private String[] dirs = new String[] {"home", "usuario", "Documents", "Images", "Downloads", "prova_ed.odt", "hino_BOTAFOGO.mp3", "prova_ihc.odt", "prova_ed_mais_top.odt", "AlunosFelizes.png", "CachorroCaramelo.png", "Debian12.8.img"};
	
	private GrafoMatriz g = new GrafoMatriz(dirs);

	public GrafoMatrizController(){
		super();
	}
	
	public String teste() throws Exception {
		String[] arquivos = {"home/usuario/Documents/prova_ed.odt", "home/usuario/Documents/hino_BOTAFOGO.mp3", "home/usuario/Documents/prova_ihc.odt", "home/usuario/Documents/prova_ed_mais_top.odt", "home/usuario/Images/AlunosFelizes.png", "home/usuario/Images/CachorroCaramelo.png", "home/usuario/Downloads/Debian12.8.img"};
		
		for(String caminho : arquivos){
			String[] path = caminho.split("/"); 
			g.add(path);	
		}
		
		return g.toString();
	}
}