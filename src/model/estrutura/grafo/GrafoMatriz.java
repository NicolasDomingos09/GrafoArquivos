package model.estrutura.grafo;

import java.util.*;

public class GrafoMatriz<T>{
	
	private int[][] matriz;
	private String[] labels;
	private String[] existentes;
	
	public GrafoMatriz(String[] labels){
		this.labels = labels;
		this.matriz = new int [labels.length][labels.length];
		this.existentes = new String [this.labels.length];
	}
	
	public void link(String label1, String label2) {
		int index_label1 = Arrays.asList(this.labels).indexOf(label1);
		int index_label2 = Arrays.asList(this.labels).indexOf(label2);
		this.matriz[index_label1][index_label2] = 1;
	}
	
	public void add(String[] caminho){
		for(int i = 1; i < caminho.length; i++){
			if(!Arrays.asList(existentes).contains(caminho[i])){
				this.link(caminho[i-1], caminho[i]);
				existentes[i-1] = caminho[i-1];
			}
		}
	}
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < this.labels.length; i++) {
			builder.append(this.labels[i] + ": ");
			for (int j = 0; j < this.labels.length; j++) {
				if (this.matriz[i][j] == 1) {
					builder.append(this.labels[j] + " ");
				}
			}
			builder.append("\r\n");
		}
		return (builder.toString());
	}
}