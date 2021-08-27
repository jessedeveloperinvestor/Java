public static void selectionSort (int vetor[]) {
	int aux;
	int tam = vetor.length;
	for(int i=0; i < tam - 1; i++ ) {
		for(int j=i+1; j < tam -1; j++ ) {
			if(vetor[j] < vetor[i]) {
				aux=vetor[j];
				vetor[j] = vetor[i];
				vetor[i] = aux;
			}
		}
	}
}