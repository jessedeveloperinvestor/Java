public void emOrdem(No raiz) {
	if (raiz !=null) {
	emOrdem(raiz.getesq());
	System.out.print(raiz.getDado() + ", ");
	emOrdem(raiz.getDir());
	}
}