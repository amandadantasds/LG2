package encadeamento;

import java.util.LinkedList;

public class ex1 {
	
	public static void main(String args[]) {
	
		Integer soma = 0;

		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add (1);
		lista.add (2);
		lista.add (3);
		lista.add (4);
		lista.add (5);
		lista.add (6);
		
		System.out.println("lista " +lista);
		
		for (int cont = 0; cont < lista.size(); cont++) {
			soma = soma + lista.get(cont);
		}
		
		System.out.println("Soma dos números da lista: " +soma);
}
}
 
