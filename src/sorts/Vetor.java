package sorts;

public class Vetor {

	public int[] VetorPiorCaso(int n) {
		int array[] = new int[n]; 
		int aux = (n - 1);
		for(int i = 0; i < array.length;i++) {
			array[i] = aux;
			aux--;
		}
		
		return array;
		
	}
	
	public int[] VetorMelhorCaso(int n) {
		int array[] = new int[n]; 
		for(int i = 0; i < n;i++) {
			array[i] = i;
		}
		
		return array;
		
	}
	
	public int[] Vetor(int n) {
		int array[] = new int[n]; 
		for(int i = 0; i < n;i++) {
			array[i] = (int)(Math.random()* n);
		}
		
		return array;
		
	}
}
