package sorts;

public class HeapSort {
	
	public int comparacoes;
	public long tempo;
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

	public void sort(int arr[])
    {
		long inicio = System.currentTimeMillis();
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
        
        long fim = System.currentTimeMillis();;
        tempo = (fim - inicio);
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
 
        // If left child is larger than root
        comparacoes++;
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        comparacoes++;
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        comparacoes++;
        if (largest != i)
        {	
        	trocas++;
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
 
    /* A utility function to print array of size n */
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
}
