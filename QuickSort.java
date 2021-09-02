public static void quickSort(int vetor[]) {
	quickSort(vetor, 0, vetor,length -1);
}
public static void quickSort(int vetor[], int i, int s) {
	int e=i, d=s;
	int item = vetor[((e+d)/2)];
	while(e<=d) {
		while(vetor[e]<item) e++;
		while(vetor[d]item) d--;
		if(e<=d) {
			int aux;
			aux=vetor[e];
			vetor[e]=vetor[d];
			vetor[d]=aux;
			d--;
			e++;
		}
	}
	if(d-i>0) quickSort(vetor, i, d);
	if(s-e>0) quickSort(vetor, e, s);
}