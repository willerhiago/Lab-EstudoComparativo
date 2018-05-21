/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacao;

import sorts.*;
/**
 *
 * @author Pedro
 */
public class Comparacao {
	
	Calculo calculo;
	
	public Comparacao() {
		this.calculo = new Calculo();
	}

    public void bubble(int tamArray, int n) {
    	BubbleSort bubble = new BubbleSort();
    	
    	Vetor vet = new Vetor();
    	
    	long tempos[] = new long[n];
     	long comparacoes[] = new long[n];
     	long trocas[] = new long[n];

        int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
        
     	long mediaComp;
     	long desvioComp ;
     	
     	long mediaTempo;
     	long desvioTempo;
     	
     	long mediaTrocas;
     	long desvioTrocas;
    	
        System.out.println("--------------------------Bubble------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        
        for(int i =0;i <n;i++) {
        	bubble.bubbleSort(arrayMelhor);
            tempos[i] = bubble.getTempo();
            bubble.getComparacoes();
            bubble.getTrocas();
     	}
        calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	bubble.bubbleSort(arrayMelhor);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+bubble.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+bubble.getTrocas()+" Desvio: 0");
    	
    	for(int i =0;i <n;i++) {
        	bubble.bubbleSort(arrayPior);
        	tempos[i] = bubble.getTempo();
        	 bubble.getComparacoes();
             bubble.getTrocas();
     	}
    	calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	bubble.bubbleSort(arrayPior);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+bubble.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+ desvioTempo);
     	System.out.println("Trocas- Media: "+bubble.getTrocas()+" Desvio: 0");
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            bubble.bubbleSort(arrayRandom);
     		tempos[i] = bubble.getTempo();
            comparacoes[i] = bubble.getComparacoes();
            trocas[i] = bubble.getTrocas();
     	}
     	
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	 mediaComp = calculo.getMedia();
     	 desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	mediaTempo = calculo.getMedia();
     	desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	mediaTrocas = calculo.getMedia();
     	desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    public void heap(int tamArray, int n) {
    	HeapSort heap = new HeapSort();
    	
    	Vetor vet = new Vetor();
    	
    	long tempos[] = new long[n];
     	long comparacoes[] = new long[n];
     	long trocas[] = new long[n];
    	
    	int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
        
        long mediaComp;
     	long desvioComp ;
     	
     	long mediaTempo;
     	long desvioTempo;
     	
     	long mediaTrocas;
     	long desvioTrocas;
    	
        System.out.println("--------------------------Heap------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        
        for(int i =0;i <n;i++) {
        	heap.sort(arrayMelhor);
            tempos[i] = heap.getTempo();
            heap.getComparacoes();
            heap.getTrocas();
     	}
        calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	heap.sort(arrayMelhor);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+heap.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+heap.getTrocas()+" Desvio: 0");
    	
     	
     	for(int i =0;i <n;i++) {
        	heap.sort(arrayPior);
            tempos[i] = heap.getTempo();
            heap.getComparacoes();
            heap.getTrocas();
     	}
     	calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	heap.sort(arrayPior);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+heap.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+heap.getTrocas()+" Desvio: 0");
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            heap.sort(arrayRandom);
     		tempos[i] = heap.getTempo();
            comparacoes[i] = heap.getComparacoes();
            trocas[i] = heap.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	 mediaComp = calculo.getMedia();
     	 desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	mediaTempo = calculo.getMedia();
     	desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	mediaTrocas = calculo.getMedia();
     	desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    public void insertion(int tamArray, int n) {
    	InsertionSort insertion = new InsertionSort();
    	
    	Vetor vet = new Vetor();
    	
        int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
        
        long mediaComp;
     	long desvioComp ;
     	
     	long mediaTempo;
     	long desvioTempo;
     	
     	long mediaTrocas;
     	long desvioTrocas;
     	
     	long tempos[] = new long[n];
     	long comparacoes[] = new long[n];
     	long trocas[] = new long[n];
    	
    	
        System.out.println("--------------------------Insertion------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        
        for(int i =0;i <n;i++) {
        	insertion.sort(arrayMelhor);
            tempos[i] = insertion.getTempo();
            insertion.getComparacoes();
            insertion.getTrocas();
     	}
        calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	insertion.sort(arrayMelhor);
    	System.out.println("\nMelhorCaso\nComparacoes- Media: "+insertion.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+insertion.getTrocas()+" Desvio: 0");
    	
     	
     	for(int i =0;i <n;i++) {
        	insertion.sort(arrayPior);
            tempos[i] = insertion.getTempo();
            insertion.getComparacoes();
            insertion.getTrocas();
     	}
        calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	insertion.sort(arrayPior);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+insertion.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+insertion.getTrocas()+" Desvio: 0");
     	
     	
     	
     	tempos = new long[n];
     	comparacoes= new long[n];
     	trocas = new long[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            insertion.sort(arrayRandom);
     		tempos[i] = insertion.getTempo();
            comparacoes[i] = insertion.getComparacoes();
            trocas[i] = insertion.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	mediaComp = calculo.getMedia();
     	desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	 mediaTempo = calculo.getMedia();
     	 desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	mediaTrocas = calculo.getMedia();
     	desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    public void merge(int tamArray, int n) {
    	MergeSort merge = new MergeSort();
    	
    	Vetor vet = new Vetor();
    	
    	long tempos[] = new long[n];
     	long comparacoes[] = new long[n];
     	long trocas[] = new long[n];
    	
    	int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
        
        long mediaComp;
     	long desvioComp ;
     	
     	long mediaTempo;
     	long desvioTempo;
     	
     	long mediaTrocas;
     	long desvioTrocas;
    	
        System.out.println("--------------------------Merge------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        
        for(int i =0;i <n;i++) {
        	merge.sort(arrayMelhor);
            tempos[i] = merge.getTempo();
            merge.getComparacoes();
            merge.getTrocas();
     	}
        calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	merge.sort(arrayMelhor);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+merge.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+merge.getTrocas()+" Desvio: 0");
    	
     	 for(int i =0;i <n;i++) {
         	merge.sort(arrayPior);
             tempos[i] = merge.getTempo();
             merge.getComparacoes();
             merge.getTrocas();
      	}
         calculo.calculaMediaEDesvio(tempos);
     	mediaTempo = calculo.getMedia();
     	desvioTempo = calculo.getDesvioPadrao();
     	merge.sort(arrayPior);
     	System.out.println("\nPiorCaso\nComparacoes- Media: "+merge.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+merge.getTrocas()+" Desvio: 0");
     	
     	tempos = new long[n];
     	comparacoes= new long[n];
     	trocas = new long[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            merge.sort(arrayRandom);
     		tempos[i] = merge.getTempo();
            comparacoes[i] = merge.getComparacoes();
            trocas[i] = merge.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	 mediaComp = calculo.getMedia();
     	 desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	 mediaTempo = calculo.getMedia();
     	 desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	 mediaTrocas = calculo.getMedia();
     	 desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    public void quick(int tamArray, int n) {
    	QuickSort quick = new QuickSort();
    	
    	Vetor vet = new Vetor();
    	
    	long tempos[] = new long[n];
     	long comparacoes[] = new long[n];
     	long trocas[] = new long[n];
    	
    	int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
        
        long mediaComp;
     	long desvioComp ;
     	
     	long mediaTempo;
     	long desvioTempo;
     	
     	long mediaTrocas;
     	long desvioTrocas;
    	
        System.out.println("--------------------------Quick------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        
        for(int i =0;i <n;i++) {
        	quick.sort(arrayMelhor,0,tamArray - 1);
            tempos[i] = quick.getTempo();
            quick.getComparacoes();
            quick.getTrocas();
     	}
        calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	quick.sort(arrayMelhor,0,tamArray - 1);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+quick.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+quick.getTrocas()+" Desvio: 0");
    	
     	for(int i =0;i <n;i++) {
        	quick.sort(arrayPior,0,tamArray - 1);
            tempos[i] = quick.getTempo();
            quick.getComparacoes();
            quick.getTrocas();
     	}
        calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	quick.sort(arrayPior,0,tamArray - 1);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+quick.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+quick.getTrocas()+" Desvio: 0");
     	
     	
     	
     	tempos= new long[n];
     	comparacoes = new long[n];
     	trocas= new long[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            quick.sort(arrayRandom,0,tamArray - 1);
     		tempos[i] = quick.getTempo();
            comparacoes[i] = quick.getComparacoes();
            trocas[i] = quick.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	mediaComp = calculo.getMedia();
     	desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	 mediaTempo = calculo.getMedia();
     	desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	 mediaTrocas = calculo.getMedia();
     	desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    public void selection(int tamArray, int n) {
    	SelectionSort selection = new SelectionSort();
    	
    	Vetor vet = new Vetor();
    	
    	long tempos[] = new long[n];
     	long comparacoes[] = new long[n];
     	long trocas[] = new long[n];
    	
    	int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
        
        long mediaComp;
     	long desvioComp ;
     	
     	long mediaTempo;
     	long desvioTempo;
     	
     	long mediaTrocas;
     	long desvioTrocas;
    	
        System.out.println("--------------------------Selection------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        
        for(int i =0;i <n;i++) {
        	selection.sort(arrayMelhor);
            tempos[i] = selection.getTempo();
            selection.getComparacoes();
            selection.getTrocas();
     	}
        calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	selection.sort(arrayMelhor);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+selection.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+selection.getTrocas()+" Desvio: 0");
    	
     	for(int i =0;i <n;i++) {
        	selection.sort(arrayPior);
            tempos[i] = selection.getTempo();
            selection.getComparacoes();
            selection.getTrocas();
     	}
        calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	selection.sort(arrayPior);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+selection.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+selection.getTrocas()+" Desvio: 0");
     	
     	
     	
     	tempos= new long[n];
     	comparacoes = new long[n];
     	trocas= new long[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            selection.sort(arrayRandom);
     		tempos[i] = selection.getTempo();
            comparacoes[i] = selection.getComparacoes();
            trocas[i] = selection.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	 mediaComp = calculo.getMedia();
     	desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	 mediaTempo = calculo.getMedia();
     	desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	mediaTrocas = calculo.getMedia();
     	desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    public void shell(int tamArray, int n) {
    	ShellSort shell = new ShellSort();
    	
    	Vetor vet = new Vetor();
    	
    	long tempos[] = new long[n];
     	long comparacoes[] = new long[n];
     	long trocas[] = new long[n];
    	
    	int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
        
        long mediaComp;
     	long desvioComp ;
     	
     	long mediaTempo;
     	long desvioTempo;
     	
     	long mediaTrocas;
     	long desvioTrocas;
    	
        System.out.println("--------------------------Shell------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        
        for(int i =0;i <n;i++) {
        	shell.sort(arrayMelhor);
            tempos[i] = shell.getTempo();
            shell.getTrocas();
            shell.getComparacoes();
     	}
        calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	shell.sort(arrayMelhor);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+shell.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+shell.getTrocas()+" Desvio: 0");
    	
     	for(int i =0;i <n;i++) {
        	shell.sort(arrayPior);
            tempos[i] = shell.getTempo();
            shell.getTrocas();
            shell.getComparacoes();
     	}
        calculo.calculaMediaEDesvio(tempos);
    	mediaTempo = calculo.getMedia();
    	desvioTempo = calculo.getDesvioPadrao();
    	shell.sort(arrayPior);
     	System.out.println("\nPiorCaso\nComparacoes- Media: "+shell.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+shell.getTrocas()+" Desvio: 0");
     	
     	
     	
     	tempos = new long[n];
     	comparacoes= new long[n];
     	trocas = new long[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            shell.sort(arrayRandom);
     		tempos[i] = shell.getTempo();
            comparacoes[i] = shell.getComparacoes();
            trocas[i] = shell.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	 mediaComp = calculo.getMedia();
     	desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	mediaTempo = calculo.getMedia();
     	desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	mediaTrocas = calculo.getMedia();
     	desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    
}
