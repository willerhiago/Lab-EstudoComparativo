package comparacao;

public class Calculo {
	
	private long[] valores;
	private long media;
	private long desvioPadrao;
	private long qntElem;
	
	public void calculaMediaEDesvio(long[] valores) {
		this.valores = valores;
		this.qntElem = valores.length;
		long soma = 0;
		for(int i = 0; i < qntElem;i++){
			soma += valores[i];
			System.out.println(soma);
		}
		this.media = (soma/qntElem);
		this.calculaDesvio();
	}
	
	private void calculaDesvio() {
		double somaVariancia = 0;
		double variacao;
		
		for(int i = 0; i < qntElem;i++){
			variacao = valores[i] - this.media;
			somaVariancia += (long)Math.pow(variacao,2);
			
		}
		this.desvioPadrao =  (long)Math.sqrt(somaVariancia/(qntElem - 1)); 
	}

	
	//--------------------------------Getters
	public long[] getValores() {
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
