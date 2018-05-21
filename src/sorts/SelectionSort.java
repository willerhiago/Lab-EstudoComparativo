package sorts;

public class SelectionSort {
	
	public int comparacoes = 0;
	public long tempo;
	public int trocas = 0;
	
	public int getTrocas() {
		int result = trocas;
		trocas = 0;
		return result;
	}
	 public void sort(int arr[])
	    {
		 	long inicio = System.currentTimeMillis();
	        int n = arr.length;
	 
	        // One by one move boundary of unsorted subarray
	        for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int min_idx = i;
	            for (int j = i+1; j < n; j++) {
	            	
	            	comparacoes++;
	            	if (arr[j] < arr[min_idx])
	                    min_idx = j;
	            }
	            // Swap the found minimum element with the first
	            // element
	            if(min_idx != i)trocas++;
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
		 	long fim = System.currentTimeMillis();
		 	tempo = (fim - inicio);
	    }
	 
    public int getComparacoes() {
    	int result = comparacoes;
		comparacoes = 0;
		return result;
	}

	public int getTempo() {
		return (int)tempo;
	}

	// Prints the array
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	 
}
