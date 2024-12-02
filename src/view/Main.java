package view;

import controller.*;

public class Main{
	public static void main(String[] args){
		GrafoMatrizController g = new GrafoMatrizController();
		
		try{
			System.out.println(g.teste());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}