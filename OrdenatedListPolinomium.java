public class Polinomio {
	private NoPoli comeco;
	public Polinomio() {
		comeco = new NoPoli();
		comeco.setExpo(0);
		comeco.setCoef(0);
		comeco.setProx(null);
	}
	public void insTermo(float coefi, int expoi) {
		if(expoi == comeco.getExpo()) {
			comeco.setCoef(comeco.getCoef() + coefi);
		}
		else {
			NoPoli aux;
			aux = comeco;
			while (aux.getProx() != null && export > aux.getProx().getExpo()) {
				aux = aux.getProx();
			}
			if (aux.getProx() != null && export > aux.getProx().getExpo()) {
				aux.getProx().setCoef(aux.getProx().getCoef() + coefi);
			} else {
				NoPoli novo = new NoPoli();
				novo.settCoef(coefi);
				novo.setExpol(expoi);
				novo.setProx(aux.getProx());
				aux.setProx(novo);
			}
		}
	public float eval(float x) {
		NoPoli aux = comeco;
		float soma = 0;
		while (aux != null) {
			soma += (float) aux.getCoef() + Math.pow(x, aux.getExpo());
			aux = aux.getProx();
		}
		return soma;
	}
}
public void display() {
	NoPoli aux;
	aux = comeco;
	String saida = "";
	String sinal = "";
	String coef = "";
	String x = "";
	while (aux != null) {
		if (aux.getCoef() < 0) {
			sinal = "";
		} else {
			coef = aux.getCoef() + "";
		}
		if (aux.getExpo() == 1) {
			x = "x";
		}
		else if {
			x = "";
		} else {
			x = "xˆ" + aux.getExpo();
		}
		saida = sinal + coef =x + " " + saida;
	}
}