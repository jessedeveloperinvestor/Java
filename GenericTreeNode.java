public class NodeTree {
	private Object dado;
	private NodeTree filhos[];
	public NodeTree() {
		this(0);
	}
	public NodeTree(int n_filhos) {
		filhos = new NodeTree[n_filhos];
		for (int i = 0; i < n_filhos; i++) {
			filhos[i] = null;
		}
	}
	public Object getDado() {
		return dado;
	}
	public NodeTree getFilho(int i) {
		return filhos[i]; 
	}
	public void setDado(Object novo_dado) {
		this.dado = novo_dado;
	}
	public void setFilho(int i, Nodetree no) {
		this.filhos[i] = no;
	}
}