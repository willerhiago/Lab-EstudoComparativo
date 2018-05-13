package sorts;

public class ShellSort {

	private int comparacoes = 0;
	private long tempo = 0;
	public int trocas = 0;
	
	public int getTrocas() {
		int result = trocas;
		trocas = 0;
		return result;
	}
    public int getComparacoes() {
		int result = comparacoes;
		comparacoes = 0;
		return result;
	}

	public int getTempo() {
		return (int)tempo;
	}

	/* An utility function to print array of size n*/
   public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    /* function to sort arr using shellSort */
    public int sort(int arr[])
    {	
    	long inicio = System.currentTimeMillis();
        int n = arr.length;
 
        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {	
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];
 
                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
            	
                for (j = i;++comparacoes > -1 && j >= gap && arr[j - gap] > temp; j -= gap) {
                	trocas++;
                	arr[j] = arr[j - gap];
                    
                }
                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
        
        long fim = System.currentTimeMillis();
        tempo = fim - inicio;
        return 0;
    }
 
   
}
