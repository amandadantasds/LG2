package árvore;

public class arvoremain {

	public static void main(String[] args) {
		
		Arvore<Integer> arvore = new Arvore <Integer>();
		arvore.adicionar(10);
		arvore.adicionar(8);
		arvore.adicionar(5);
		arvore.adicionar(9);
		arvore.adicionar(7);
		arvore.adicionar(18);
		arvore.adicionar(13);
		arvore.adicionar(20);
		Systen.out.println("Em-Ordem");
		arvore.emOrdem(arvore.getRaiz());

		Systen.out.println("\n\nPré-Ordem");
		arvore.preOrdem(arvore.getRaiz());

		Systen.out.println("\n\nPós-Ordem");
		arvore.posOrdem(arvore.getRaiz());

	}

}
