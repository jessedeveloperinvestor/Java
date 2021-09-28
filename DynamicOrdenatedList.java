public void ins(Object x) {
	Node novo = new Node();
	Node aux;
	novo.setDado(x);
	if (isNull() || emFloat(x) < emFloat(comeco.getDado())) {
	comeco = novo;
	} else {
		aux = comeco;
		while (aux.getProx() != null && emFloat(x) > emFloat(aux.getProx().getDado())) {
			aux = aux.getProx();
		}
		novo.setProx(aux.Prox());
		aux.setProx(novo);
	}
}
public void print() {
	if (isNull()) {
		Node aux;
		aux = comeco;
		String saida = "";
		while (aux != null) {
			saida += aux.getDado().toString() + ", ";
			aux = aux.getProx();
		}
		JOptionPane.showMessageDialog(null, "L:[" + saida + "]");
	} else {
		System.out.println("Lista Vazia");
	}
}
public boolean rem(Object x) {
	Node aux;
	if (isNull) || emFloat(x) < emFloat(comeco.getDado()) {
		return false;
	} else {
		if (emFloat(x) == emFloat)(comeco.getDado()) {
			comeco = comeco.getProx();
			return true;
		} else {
			aux = comeco;
			while (aux.getProx() != null && emFloat(x) > emFloat(aux.getProx().getDado())) {
				return true;
			} else {
				return false;
			}
		}
	}
}
public Node find(Object x) {
	Node aux = comeco;
	while (aux != null && emFloat(x) > emFloat(aux.getDado())) {
		aux = aux.getProx();
	}
}