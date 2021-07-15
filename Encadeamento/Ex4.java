package encadeamento;

import java.util.LinkedList;

public class ex2 {
	
	public static void main(String args[]) {
		
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add (1);
		lista.add (2);
		lista.add (3);
		lista.add (4);
		lista.add (6);
		lista.add (5);
		
		System.out.println("lista " +lista);
		
		Integer maior = 0;
		
		for (int cont = 0; cont < lista.size(); cont++) {
			
			if (maior < lista.get(cont))
				maior = lista.get(cont);
			
			System.out.println("O maior nodo da lista é: " +maior);
			
		}
		}
}
 
