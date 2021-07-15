package árvore;

public class Arvore <TIPO extends Compareble> {
	

	public static void main(String args[]) {
		
		private Elemento<TIPO> raiz;
		
		public Arvore(){
			this.raiz = null;
			
		}
		
	    public void adicionar (TIPO valor) {
	    	Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
	    	if (raiz == null){
			this.raiz = novoElemento;
	    	}else{
	    		Elemento<TIPO> atual = this.raiz;
	    		
	    	while (true) {
	    		if (novoElemento.getValor() .comparebleTo (atual.getValor()) == -1) {
	    			if (atual.getEsquerda() != null) {
	    				atual = atual.getEsquerda();
	    				
	    			}else{
	    				atual.setEsquerda(novoElemento);
	    				break;
	    			}
	    			
	    		}else{
	    			if (atual.getDireita() != null) {
	    				atual = atual.getDireita();
	    				
	    			}else{
	    				atual.setDireita(novoElemento);
	    				break;
	    			
	    				}
	    			}
	    		}
		}
	
	}

	public Elemento<TIPO> getRaiz() {
		return raiz;
	}

// imprimindo em ordem

	public static void emOrdem(Elemento<TIPO> atual) {
		if (atual != null) {
			emOrdem(atual.getEsquerda());
			System.out.println(atual.getValor());
			emOrdem(atual.getDireita());
		}
	}

// imprimindo pré ordem

	public static void preOrdem(Elemento<TIPO> atual) {
		if (atual != null) {
			System.out.println(atual.getValor());
			preOrdem(atual.getEsquerda());
			preOrdem(atual.getDireita());
			
		}
	}

// imprimindo pós ordem

	public static void posOrdem(Elemento<TIPO> atual) {
		if (atual != null) {
			posOrdem(atual.getEsquerda());
			posOrdem(atual.getDireita());
			System.out.println(atual.getValor());
		}
	}


}

}
