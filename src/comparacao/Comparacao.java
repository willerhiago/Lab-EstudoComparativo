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

        int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
    	
        System.out.println("--------------------------Bubble------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        bubble.bubbleSort(arrayMelhor);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+bubble.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+bubble.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+bubble.getTrocas()+" Desvio: 0");
    	
    	bubble.bubbleSort(arrayPior);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+bubble.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+bubble.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+bubble.getTrocas()+" Desvio: 0");
     	
     	
     	
     	int tempos[] = new int[n];
     	int comparacoes[] = new int[n];
     	int trocas[] = new int[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            bubble.bubbleSort(arrayRandom);
     		tempos[i] = bubble.getTempo();
            comparacoes[i] = bubble.getComparacoes();
            trocas[i] = bubble.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	long mediaComp = calculo.getMedia();
     	long desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	long mediaTempo = calculo.getMedia();
     	long desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	long mediaTrocas = calculo.getMedia();
     	long desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    public void heap(int tamArray, int n) {
    	HeapSort heap = new HeapSort();
    	
    	Vetor vet = new Vetor();
    	
        int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
    	
        System.out.println("--------------------------Heap------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        heap.sort(arrayMelhor);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+heap.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+heap.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+heap.getTrocas()+" Desvio: 0");
    	
    	heap.sort(arrayPior);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+heap.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+heap.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+heap.getTrocas()+" Desvio: 0");
     	
     	
     	
     	int tempos[] = new int[n];
     	int comparacoes[] = new int[n];
     	int trocas[] = new int[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            heap.sort(arrayRandom);
     		tempos[i] = heap.getTempo();
            comparacoes[i] = heap.getComparacoes();
            trocas[i] = heap.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	long mediaComp = calculo.getMedia();
     	long desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	long mediaTempo = calculo.getMedia();
     	long desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	long mediaTrocas = calculo.getMedia();
     	long desvioTrocas = calculo.getDesvioPadrao();
     	
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
    	
        System.out.println("--------------------------Insertion------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        insertion.sort(arrayMelhor);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+insertion.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+insertion.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+insertion.getTrocas()+" Desvio: 0");
    	
    	insertion.sort(arrayPior);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+insertion.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+insertion.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+insertion.getTrocas()+" Desvio: 0");
     	
     	
     	
     	int tempos[] = new int[n];
     	int comparacoes[] = new int[n];
     	int trocas[] = new int[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            insertion.sort(arrayRandom);
     		tempos[i] = insertion.getTempo();
            comparacoes[i] = insertion.getComparacoes();
            trocas[i] = insertion.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	long mediaComp = calculo.getMedia();
     	long desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	long mediaTempo = calculo.getMedia();
     	long desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	long mediaTrocas = calculo.getMedia();
     	long desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    public void merge(int tamArray, int n) {
    	MergeSort merge = new MergeSort();
    	
    	Vetor vet = new Vetor();
    	
        int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
    	
        System.out.println("--------------------------Merge------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        merge.sort(arrayMelhor);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+merge.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+merge.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+merge.getTrocas()+" Desvio: 0");
    	
    	merge.sort(arrayPior);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+merge.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+merge.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+merge.getTrocas()+" Desvio: 0");
     	
     	
     	
     	int tempos[] = new int[n];
     	int comparacoes[] = new int[n];
     	int trocas[] = new int[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            merge.sort(arrayRandom);
     		tempos[i] = merge.getTempo();
            comparacoes[i] = merge.getComparacoes();
            trocas[i] = merge.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	long mediaComp = calculo.getMedia();
     	long desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	long mediaTempo = calculo.getMedia();
     	long desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	long mediaTrocas = calculo.getMedia();
     	long desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    public void quick(int tamArray, int n) {
    	QuickSort quick = new QuickSort();
    	
    	Vetor vet = new Vetor();
    	
        int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
    	
        System.out.println("--------------------------Quick------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        quick.sort(arrayMelhor,0,tamArray);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+quick.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+quick.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+quick.getTrocas()+" Desvio: 0");
    	
    	quick.sort(arrayPior,0,tamArray);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+quick.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+quick.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+quick.getTrocas()+" Desvio: 0");
     	
     	
     	
     	int tempos[] = new int[n];
     	int comparacoes[] = new int[n];
     	int trocas[] = new int[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            quick.sort(arrayRandom,0,tamArray);
     		tempos[i] = quick.getTempo();
            comparacoes[i] = quick.getComparacoes();
            trocas[i] = quick.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	long mediaComp = calculo.getMedia();
     	long desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	long mediaTempo = calculo.getMedia();
     	long desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	long mediaTrocas = calculo.getMedia();
     	long desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    public void selection(int tamArray, int n) {
    	SelectionSort selection = new SelectionSort();
    	
    	Vetor vet = new Vetor();
    	
        int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
    	
        System.out.println("--------------------------Selection------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        selection.sort(arrayMelhor);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+selection.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+selection.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+selection.getTrocas()+" Desvio: 0");
    	
    	selection.sort(arrayPior);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+selection.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+selection.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+selection.getTrocas()+" Desvio: 0");
     	
     	
     	
     	int tempos[] = new int[n];
     	int comparacoes[] = new int[n];
     	int trocas[] = new int[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            selection.sort(arrayRandom);
     		tempos[i] = selection.getTempo();
            comparacoes[i] = selection.getComparacoes();
            trocas[i] = selection.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	long mediaComp = calculo.getMedia();
     	long desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	long mediaTempo = calculo.getMedia();
     	long desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	long mediaTrocas = calculo.getMedia();
     	long desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    public void shell(int tamArray, int n) {
    	ShellSort shell = new ShellSort();
    	
    	Vetor vet = new Vetor();
    	
        int arrayRandom[];
        int arrayPior[] = vet.VetorPiorCaso(tamArray);
        int arrayMelhor[] = vet.VetorMelhorCaso(tamArray);
    	
        System.out.println("--------------------------Shell------------------------");
        System.out.println("Tamanho Array: " + tamArray );
        shell.sort(arrayMelhor);
        System.out.println("\nMelhorCaso\nComparacoes- Media: "+shell.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+shell.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+shell.getTrocas()+" Desvio: 0");
    	
    	shell.sort(arrayPior);
    	System.out.println("\nPiorCaso\nComparacoes- Media: "+shell.getComparacoes()+" Desvio: 0");
     	System.out.println("Tempo- Media: "+shell.getTempo()+" Desvio: 0");
     	System.out.println("Trocas- Media: "+shell.getTrocas()+" Desvio: 0");
     	
     	
     	
     	int tempos[] = new int[n];
     	int comparacoes[] = new int[n];
     	int trocas[] = new int[n];
     	
     	for(int i = 0;i < n; i++) {
            arrayRandom = vet.Vetor(tamArray);
            shell.sort(arrayRandom);
     		tempos[i] = shell.getTempo();
            comparacoes[i] = shell.getComparacoes();
            trocas[i] = shell.getTrocas();
     	}
     	
     	calculo.calculaMediaEDesvio(comparacoes);
     	long mediaComp = calculo.getMedia();
     	long desvioComp = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(tempos);
     	long mediaTempo = calculo.getMedia();
     	long desvioTempo = calculo.getDesvioPadrao();
     	
     	calculo.calculaMediaEDesvio(trocas);
     	long mediaTrocas = calculo.getMedia();
     	long desvioTrocas = calculo.getDesvioPadrao();
     	
     	System.out.println("\nMédioCaso\nComparacoes- Media: "+mediaComp+" Desvio: "+desvioComp);
     	System.out.println("Tempo- Media: "+mediaTempo+" Desvio: "+desvioTempo);
     	System.out.println("Trocas- Media: "+mediaTrocas+" Desvio: "+desvioTrocas);
     	
     	
    }
    
    
}
