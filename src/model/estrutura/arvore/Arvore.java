package model.estrutura.arvore;

import java.util.*;

public class Arvore<T>{
	private raiz;
	
	public Arvore(){
		this.raiz = null;
	}
	
	public Node<T> adicionar(Node<T> anterior, T novoE){
		Node<T> buffer = anterior;
		Node<T> novo = new Node<>(novoE);
		if(anterior == null){
			if(this.raiz == null){
				this.raiz = novo;
			}else{
				buffer = this.raiz;
				buffer.ponteiros.add(novo);		
			}
		} else{
			buffer.ponteiros.add(novo);
		}
	}
	
	public void arquivo(String[] caminho){
		Node<T> buffer = null;
		Node<T> anterior = null;
		
		if(this.raiz == null)
			adicionar(anterior, caminho[i]);
		
		buffer = this.raiz.ponteiros.get(0); //primeiro filho da raiz
		anterior = this.raiz;
		
		
	}
	
	public void mostrar(){
		
	}
	
}