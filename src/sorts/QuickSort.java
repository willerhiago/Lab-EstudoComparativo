package sorts;

public class QuickSort {
	 
    private int array[];
    private int length;
    
    public int comparacoes = 0;
	public long tempo = 0;
	public int trocas = 0;
 
    
	public int[] sort(int[] inputArr) {
		
		this.trocas = 0;
		this.comparacoes = 0;
        if (inputArr == null || inputArr.length == 0) return null;
        long inicio = System.currentTimeMillis();
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
        long fim = System.currentTimeMillis();
        this.tempo = (fim - inicio);
        return inputArr;
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
 
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
 
        while (i <= j) {
 
            while (++comparacoes >= -1 && array[i] < pivot) { // comparando
 
                i++;
            }
 
            while (++comparacoes >= -1 && array[j] > pivot) { // comparando
 
                j--;
            }
 
            if (i <= j) {
                exchangeNumbers(i, j);
 
                i++;
                j--;
            }
        }
 
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
 
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
 
        if(i!=j){ 
        	trocas++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
 
    }
    public int getComparacoes() {
    	int result = comparacoes;
		comparacoes = 0;
		return result;
	}

	public int getTempo() {
		return (int)tempo;
	}

	public int getTrocas() {
		int result = trocas;
		trocas = 0;
		return result;
	}

}