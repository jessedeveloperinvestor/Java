public void posOrdem(No raiz) {
	if (raiz !=null) {
	posOrdem(raiz.getesq());
	posOrdem(raiz.getDir());
	System.out.print(raiz.getDado() + ", ");
	}
}