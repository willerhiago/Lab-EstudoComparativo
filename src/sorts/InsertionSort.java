package sorts;

public class InsertionSort {

	public int comparacoes = 0;
	public long tempo = 0;
	
	/*Function to sort array using insertion sort*/
    public void sort(int arr[])
    {
    	long a = System.currentTimeMillis();
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            
            while (++comparacoes >= -1 && j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        long b = System.currentTimeMillis();
        tempo = (b - a);
    }
 
    public int getComparacoes() {
    	int result = comparacoes;
		comparacoes = 0;
		return result;
	}

	public long getTempo() {
		return tempo;
	}

	/* A utility function to print array of size n*/
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
}
