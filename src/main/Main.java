package main;

import sorts.*;

public class Main {

	public static void main(String[] args) {
		Vetor vet = new Vetor();
		
		int n = 100;
		
		int arrayRandom[] = vet.Vetor(n);
		int arrayPior[] = vet.VetorPiorCaso(n);
		int arrayMelhor[] = vet.VetorMelhorCaso(n);

		
		BubbleSort bubble = new BubbleSort();
		System.out.println("\n-----------BubbleSort----------");
		bubble.bubbleSort(arrayMelhor);
		System.out.println("\nMelhor caso\nComparações: "+ bubble.getComparacoes()+" Trocas: " + bubble.getTrocas() +" Tempo: "+ bubble.getTempo());
		bubble.bubbleSort(arrayRandom);
		System.out.println("\nMédio caso\nComparações: "+ bubble.getComparacoes()+" Trocas: " + bubble.getTrocas() + " Tempo: "+ bubble.getTempo());	
		bubble.bubbleSort(arrayPior);
		System.out.println("\nPior caso\nComparações: "+ bubble.getComparacoes()+" Trocas: " + bubble.getTrocas() +" Tempo: "+ bubble.getTempo());
		System.out.println("----------------------------------------------------------------------------");
		
		
		arrayRandom = vet.Vetor(n);
		arrayPior = vet.VetorPiorCaso(n);
		arrayMelhor = vet.VetorMelhorCaso(n);
		
		SelectionSort selec = new SelectionSort();
		System.out.println("\n-----------Selection----------");
		selec.sort(arrayMelhor);
		System.out.println("\nMelhor caso\nComparações: "+ selec.getComparacoes()+" Tempo: "+ selec.getTempo());
		selec.sort(arrayRandom);
		System.out.println("\nMédio caso\nComparações: "+ selec.getComparacoes()+" Tempo: "+ selec.getTempo());
		selec.sort(arrayPior);
		System.out.println("\nPior caso\nComparações: "+ selec.getComparacoes()+" Tempo: "+ selec.getTempo());
		System.out.println("----------------------------------------------------------------------------");
		
		arrayRandom = vet.Vetor(n);
		arrayPior = vet.VetorPiorCaso(n);
		arrayMelhor = vet.VetorMelhorCaso(n);
		
		HeapSort heap = new HeapSort();
		System.out.println("\n-----------Heap----------");
		heap.sort(arrayMelhor);
		System.out.println("\nMelhor caso\nComparações: "+ heap.getComparacoes()+" Tempo: "+ heap.getTempo());
		heap.sort(arrayRandom);
		System.out.println("\nMédio caso\nComparações: "+ heap.getComparacoes()+" Tempo: "+ heap.getTempo());
		heap.sort(arrayPior);
		System.out.println("\nPior caso\nComparações: "+ heap.getComparacoes()+" Tempo: "+ heap.getTempo());
		System.out.println("----------------------------------------------------------------------------");

		arrayRandom = vet.Vetor(n);
		arrayPior = vet.VetorPiorCaso(n);
		arrayMelhor = vet.VetorMelhorCaso(n);
		
		InsertionSort insertion = new InsertionSort();
		System.out.println("\n-----------Insertion----------");
		insertion.sort(arrayMelhor);
		System.out.println("\nMelhor caso\nComparações: "+ insertion.getComparacoes()+" Tempo: "+ insertion.getTempo());
		insertion.sort(arrayRandom);
		System.out.println("\nMédio caso\nComparações: "+ insertion.getComparacoes()+" Tempo: "+ insertion.getTempo());
		insertion.sort(arrayPior);
		System.out.println("\nPior caso\nComparações: "+ insertion.getComparacoes()+" Tempo: "+ insertion.getTempo());
		System.out.println("----------------------------------------------------------------------------");
	
		arrayRandom = vet.Vetor(n);
		arrayPior = vet.VetorPiorCaso(n);
		arrayMelhor = vet.VetorMelhorCaso(n);
		
		MergeSort merge = new MergeSort();
		System.out.println("\n-----------Merge----------");
		merge.sort(arrayMelhor);
		System.out.println("\nMelhor caso\nComparações: "+ merge.getComparacoes()+" Tempo: "+ merge.getTempo());
		merge.sort(arrayRandom);
		System.out.println("\nMédio caso\nComparações: "+ merge.getComparacoes()+" Tempo: "+ merge.getTempo());
		merge.sort(arrayPior);
		System.out.println("\nPior caso\nComparações: "+ merge.getComparacoes()+" Tempo: "+ merge.getTempo());
		System.out.println("----------------------------------------------------------------------------");

		arrayRandom = vet.Vetor(n);
		arrayPior = vet.VetorPiorCaso(n);
		arrayMelhor = vet.VetorMelhorCaso(n);
		
		QuickSort quick = new QuickSort();
		System.out.println("\n-----------Quick----------");
		quick.sort(arrayMelhor,0,arrayMelhor.length -1);
		System.out.println("\nMelhor caso\nComparações: "+ quick.getComparacoes()+" Tempo: "+ quick.getTempo());
		quick.sort(arrayRandom,0,arrayRandom.length - 1);
		System.out.println("\nMédio caso\nComparações: "+ quick.getComparacoes()+" Tempo: "+ quick.getTempo());
		quick.sort(arrayPior,0,arrayPior.length - 1);
		System.out.println("\nPior caso\nComparações: "+ quick.getComparacoes()+" Tempo: "+ quick.getTempo());
		
		arrayRandom = vet.Vetor(n);
		arrayPior = vet.VetorPiorCaso(n);
		arrayMelhor = vet.VetorMelhorCaso(n);
		
		ShellSort shell = new ShellSort();
		System.out.println("\n-----------Shell----------");
		shell.sort(arrayMelhor);
		System.out.println("\nMelhor caso\nComparações: "+ shell.getComparacoes()+" Tempo: "+ shell.getTempo());
		shell.sort(arrayRandom);
		System.out.println("\nMédio caso\nComparações: "+ shell.getComparacoes()+" Tempo: "+ shell.getTempo());
		shell.sort(arrayPior);
		System.out.println("\nPior caso\nComparações: "+ shell.getComparacoes()+" Tempo: "+ shell.getTempo());
		
	}

}
