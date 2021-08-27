public static void bubbleSort (int vetor[]) {
	int aux;
	int tam = vetor.length;
	for(int i=0; i < tam - 1; i++ ) {
		for(int j=0; j < tam -1; j++ ) {
			if(vetor[j] > vetor[j+1]) {
				aux=vetor[j];
				vetor[j] = vetor[j+1];
				vetor[j+1] = aux;
			}
		}
	}
}