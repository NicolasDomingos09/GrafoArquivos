package model.estrutura.arvore;

import java.util.*;

public class Node<T>{
	private T elemento;
	public ArrayList<Node> ponteiros;
	
	public Node(T elemento){
		this.elemento = elemento;
		this.ponteiros = new ArrayList<>();
	}
	
	public T getElemento(){
		return this.elemento.toString();
	}
	
	public void setElemento(T elemento){
		this.elemento = elemento;
	}
}