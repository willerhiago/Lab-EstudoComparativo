package sorts;

public class QuickSort {

	public int comparacoes = 0;
	public long tempo = 0;
	public int trocas = 0;
	
	public int getTrocas() {
		int result = trocas;
		trocas = 0;
		return result;
	}
	/* This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
    private int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<=high-1; j++)
        {
            // If current element is smaller than or
            // equal to pivot
        	
            if (comparacoes++ > -1 && arr[j] <= pivot)
            {
                i++;
                trocas++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        trocas++;
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
    public int getComparacoes() {
    	int result = comparacoes;
    	comparacoes = 0;
		return result;
	}

	public int getTempo() {
		return (int)tempo;
	}

	/* The main function that implements QuickSort()
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    private void qSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
            now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            qSort(arr, low, pi-1);
            qSort(arr, pi+1, high);
        }
    }
    
    public void sort(int arr[], int low, int high) {
    	long inicio = System.currentTimeMillis();
    	qSort(arr,low,high);
    	long fim = System.currentTimeMillis();
    	tempo = (fim - inicio);
    }
}
