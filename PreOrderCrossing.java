public void preOrdem(No raiz) {
	if (raiz !=null) {
	System.out.print(raiz.getDado() + ", ");
	preOrdem(raiz.getesq());
	preOrdem(raiz.getDir());
	}
}