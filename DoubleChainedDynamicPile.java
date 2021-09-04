public class Pilha {
	private Node topo;

	public Pilha() {
		topo = null;
	}
	public boolean isEmpty() {
		return topo == null;
	}
	public void push (Object x) {
		Node novo == new Node();
		novo.setDado(x);
		novo.setProx(topo);
		topo = novo;
	}
	public Object top() {
		if(!isEmpty()) {
			return topo.getDado();
		}
		else {
			return null;
		}
	}
	public Object pop() {
		if(!isEmpty()) {
			Object resp = topo.getDado();
			topo = topo.getProx();
			return resp;
		}
		else {
			return null;
		}
	}
	public void print() {
		if(!isEmpty()) {
			String resp = new String();
			Node aux;
			aux = topo;
			while (aux != null) {
				resp = ", " + aux.getDado().toString() + resp;
				aux = aux.getProx();
			}
			System.out.printIN("P:[ " + resp + " ] ");
		} else {
			System.printIn("Pilha Vazia!");
		}
	}
}