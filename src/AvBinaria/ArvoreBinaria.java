package AvBinaria;

/**
 *
 * @author hellder
 */
public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria(){
	raiz = null;
    }
	

    public boolean vazia (){
	return (raiz == null);
    }
    private No busca(No T, int valor) {          
	No aux;

	if (T == null){
            return null; 
        }
	if(T.getConteudo() == valor){
            return T;
        }
        aux = busca(T.getEsq(), valor);
	if (aux == null){
            aux = busca(T.getDir(), valor);
        }
	return aux;
	}
    public No busca(int valor) {          
        if (vazia()){
            return null;
        }	
	return busca(raiz, valor);
	} 
    public boolean insereRaiz(int valor) {   
        if (raiz != null) {
	return false;  
        }
        No novoNo = new No();
	novoNo.setConteudo(valor);
	novoNo.setEsq(null);
	novoNo.setEsq(null);
		
	raiz = novoNo;
	return true;
	}   
    public boolean insereDir(int vPai, int vFilho ) {
		
	No filho = busca(vFilho);
        if (filho != null)
	    return false; 
	
	No pai = busca(vPai);
	if (pai == null)
            return false;  
		
	if (pai.getDir() != null)
            return false;  
	
	No novoNo = new No();
	novoNo.setConteudo(vFilho);
	novoNo.setEsq(null);
	novoNo.setDir(null);
		
	pai.setDir(novoNo);
		
	return true;
}
	public boolean insereEsq(int vPai, int vFilho ) {
	No filho = busca(vFilho);
	if (filho != null)
	    return false;

	No pai = busca(vPai);
	if (pai == null)
            return false; 
	 
	if (pai.getEsq() != null)
            return false; 
	
	No novoNo = new No();
	novoNo.setConteudo(vFilho);
	novoNo.setEsq(null);
	novoNo.setDir(null);
		
	pai.setEsq(novoNo);
	return true;
	}
	private void exibePreOrdem(No T) {
            if (T == null)
		return;
	
            System.out.print(" " + T.getConteudo());
            if (T.getEsq() != null)
		exibePreOrdem(T.getEsq());
	
            if (T.getDir() != null)
		exibePreOrdem(T.getDir());
	}
	public void exibePreOrdem() {
            if (raiz == null)
		System.out.println("Arvore vazia");
            else
		exibePreOrdem(raiz);
	}	
	private void exibeInOrdem(No T) {
	if (T == null)
            return ;

	if (T.getEsq() != null)
		exibeInOrdem(T.getEsq());
	System.out.print(" " + T.getConteudo());
	
	 if (T.getDir() != null)
		exibeInOrdem(T.getDir());
	}
    public void exibeInOrdem() {
	if (raiz == null)
		System.out.println("Arvore vazia");
	else
		exibeInOrdem(raiz);
}	
    private void exibePosOrdem(No T) {
	if (T == null){
            return ;
        }
        if (T.getEsq() != null){
            exibePosOrdem(T.getEsq());
        }
	if (T.getDir() != null){
            exibePosOrdem(T.getDir());
        }
	System.out.print(" " + T.getConteudo());
	}
    public void exibePosOrdem() {
	if (raiz == null){
		System.out.println("Arvore vazia");
        }else{
            exibePosOrdem(raiz);
        }
}
        static class No{
            	private int conteudo;
            private No esq;
            private No dir;
	
            public No(){
                    esq = null;
                    dir = null;
            }
	
            public int getConteudo() {
		return conteudo;
            }
            public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
            }
	
            public No getEsq() {
		return esq;
            }
            public void setEsq(No esq) {
		this.esq = esq;
            }
	
            public No getDir() {
		return dir;
            }
	
            public void setDir(No dir) {
            	this.dir = dir;
            }
        }
}
