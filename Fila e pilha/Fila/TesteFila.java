package ed.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Testefila {

	public static void main(String[] args) {
		
		FILA fila = new FILA();
		
		fila.adiciona ("Arroz");
		fila.adiciona ("Feijão");
		
		System.out.println(fila);
	
		String x1 = fila.remove();
		
		System.out.println(x1);
		System.out.println(fila);
		
		Queue<String> FilaDoJava = new LinkedList<String>();
		
		FilaDoJava.add("arroz");
		String x2 = FilaDoJava.poll();
			
			System.out.println(x2);
		
	}

}
