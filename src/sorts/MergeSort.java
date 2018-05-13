package sorts;

public class MergeSort {

	public int comparacoes = 0;
	public long tempo = 0;
	public int trocas = 0;
	
	public int getTrocas() {
		int result = trocas;
		trocas = 0;
		return result;
	}
	
	private void mSort(int[] array)
	    {
	        if(array == null)
	        {
	            return;
	        }
	 
	        if(array.length > 1)
	        {
	            int mid = array.length / 2;
	 
	            // Split left part
	            int[] left = new int[mid];
	            for(int i = 0; i < mid; i++)
	            {
	                left[i] = array[i];
	            }
	             
	            // Split right part
	            int[] right = new int[array.length - mid];
	            for(int i = mid; i < array.length; i++)
	            {
	                right[i - mid] = array[i];
	            }
	            mSort(left);
	            mSort(right);
	 
	            int i = 0;
	            int j = 0;
	            int k = 0;
	 
	            // Merge left and right arrays
	            while(i < left.length && j < right.length)
	            {	
	            	
	                if(comparacoes++ > -1 && left[i] < right[j])
	                {
	                	trocas++;
	                	array[k] = left[i];
	                    i++;
	                }
	                else
	                {   
	                	trocas++;
	                    array[k] = right[j];
	                    j++;
	                }
	                k++;
	            }
	            // Collect remaining elements
	            while(i < left.length)
	            {
	                array[k] = left[i];
	                i++;
	                k++;
	            }
	            while(j < right.length)
	            {
	                array[k] = right[j];
	                j++;
	                k++;
	            }
	        }
	 }

	public int getComparacoes() {
		int result = comparacoes;
		comparacoes = 0;
		return result;
	}

	public long getTempo() {
		return tempo;
	}
	
	public void sort(int[] array) {
		long inicio = System.currentTimeMillis();
		mSort(array);
		long fim = System.currentTimeMillis();
        tempo = (fim - inicio);
	}
	  
}
