package comparacao;

public class ComparacaoTeste {
	
	private int[] valores;
	private int media;
	private double desvioPadrao;
	private int qntElem;
	
	public void calculaMediaEDesvio(int[] valores) {
		this.valores = valores;
		this.qntElem = valores.length;
		int soma = 0;
		for(int i = 0; i < qntElem;i++){
			soma += valores[i];
		}
		this.media = (soma/qntElem);
		this.calculaDesvio();
	}
	
	private void calculaDesvio() {
		double somaVariancia = 0;
		int variacao;
		
		for(int i = 0; i < qntElem;i++){
			variacao = valores[i] - this.media;
			somaVariancia += (int)Math.pow(variacao,2);
			
		}
		this.desvioPadrao =  Math.sqrt(somaVariancia/(qntElem - 1)); 
	}

	
	//--------------------------------Getters
	public int[] getValores() {
		return valores;
	}

	public int getMedia() {
		return media;
	}

	public double getDesvioPadrao() {
		return desvioPadrao;
	}

	public int getQntElem() {
		return qntElem;
	}
	
	
}
