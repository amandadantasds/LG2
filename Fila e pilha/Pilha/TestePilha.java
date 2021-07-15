package Ed.Pilha;

import java.util.Stack;

public class testedapilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.push("Ana");
		System.out.println(pilha);
		
		pilha.push("Dani");
		System.out.println(pilha);
		
		String r1 = pilha.pop();
		System.out.println(r1);
		
		String r2 = pilha.pop();
		System.out.println(r2);
		
		System.out.println(pilha.vazia());
		
		pilha.push("Lulu");
		
		System.out.println(pilha.vazia());
		System.out.println(pilha);
		
		Stack<String> stack = new Stack <String>();
		stack.push("Dani");
		stack.push ("Lilian");
		
		System.out.println(stack);
		
		System.out.println(stack.pop()); 
		
		System.out.println(stack);
		
		String nome = stack.peek();
		System.out.println(nome);
		
		System.out.println(stack);
	}

}
