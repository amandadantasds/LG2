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

}
