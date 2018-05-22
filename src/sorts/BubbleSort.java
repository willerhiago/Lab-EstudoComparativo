package sorts;

public class BubbleSort {

	public long comparacoes = 0;
	public long tempo;
	public long trocas = 0;
	
	public void bubbleSort(int arr[])
	    {
			this.trocas = 0;
	 		this.comparacoes = 0;
		 	long inicio = System.currentTimeMillis();
		 	int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++) {
	            	comparacoes++;
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                	trocas++;
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        
	        long fim = System.currentTimeMillis();
	        tempo = (fim - inicio);
	    }
	 
	public long getComparacoes() {
		long result = comparacoes;
		comparacoes = 0;
		return result;
	}
	
	public long getTrocas() {
		long result = trocas;
		trocas = 0;
		return result;
	}

	public long getTempo() {
		return (int)tempo;
	}

	/* Prints the array */
  public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
