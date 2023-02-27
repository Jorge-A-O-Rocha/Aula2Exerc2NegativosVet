package controller;

public class modulos {
	public modulos() {
		super();
	}
	
	public int qneg(int [] vet, int tamanho) {
		// a condição de para é quando ele percorrer todo o vetor
		if (tamanho < 0 ){
			return 0;
		} else {
			// se for negativo soma 1 se não  só percorre o vetor 
			if(vet[tamanho] < 0){
				return 1 + qneg(vet,tamanho-1);
		}
			return qneg(vet, tamanho-1);
		}
	}

}
