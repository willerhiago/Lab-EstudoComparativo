package comparacao;

public class Calculo {
	
	private int[] valores;
	private long media;
	private long desvioPadrao;
	private long qntElem;
	
	public void calculaMediaEDesvio(int[] valores) {
		this.valores = valores;
		this.qntElem = valores.length;
		long soma = 0;
		for(int i = 0; i < qntElem;i++){
			soma += valores[i];
		}
		this.media = (soma/qntElem);
		this.calculaDesvio();
	}
	
	private void calculaDesvio() {
		double somaVariancia = 0;
		long variacao;
		
		for(int i = 0; i < qntElem;i++){
			variacao = valores[i] - this.media;
			somaVariancia += (long)Math.pow(variacao,2);
			
		}
		this.desvioPadrao =  (long)Math.sqrt(somaVariancia/(qntElem - 1)); 
	}

	
	//--------------------------------Getters
	public int[] getValores() {
		return valores;
	}

	public long getMedia() {
		return media;
	}

	public long getDesvioPadrao() {
		return desvioPadrao;
	}

	public long getQntElem() {
		return qntElem;
	}
	
	
}
