package main;

import sorts.*;

public class Main {

    public static void main(String[] args) {
        Vetor vet = new Vetor();

        int n = 10;

        for (int i = 0; i < 10; i++) {
            long[][] resultado = Bubble(n);
            System.out.println("\nMelhor caso\nCompara��es: " + resultado[0][0] + " Tempo: " + resultado[0][1]);
            System.out.println("\nMédio caso\nCompara��es: " + resultado[1][0] + " Tempo: " + resultado[1][1]);
            System.out.println("\nPior caso\nCompara��es: " + resultado[2][0] + " Tempo: " + resultado[2][1]);
            System.out.println("----------------------------------------------------------------------------");
            n = n * 10;
        }

//               arrayRandom = vet.Vetor(n);
//		 arrayPior = vet.VetorPiorCaso(n);
//		 arrayMelhor = vet.VetorMelhorCaso(n);
//		
//		 SelectionSort selec = new SelectionSort();
//		 System.out.println("\n-----------Selection----------");
//		 selec.sort(arrayMelhor);
//		 System.out.println("\nMelhor caso\nCompara��es: "+ selec.getComparacoes()+" Tempo: "+ selec.getTempo());
//		 selec.sort(arrayRandom);
//		 System.out.println("\nMédio caso\nCompara��es: "+ selec.getComparacoes()+" Tempo: "+ selec.getTempo());
//		 selec.sort(arrayPior);
//		 System.out.println("\nPior caso\nCompara��es: "+ selec.getComparacoes()+" Tempo: "+ selec.getTempo());
//		 System.out.println("----------------------------------------------------------------------------");
//		
//		 arrayRandom = vet.Vetor(n);
//		 arrayPior = vet.VetorPiorCaso(n);
//		 arrayMelhor = vet.VetorMelhorCaso(n);
//		
//		 HeapSort heap = new HeapSort();
//		 System.out.println("\n-----------Heap----------");
//		 heap.sort(arrayMelhor);
//		 System.out.println("\nMelhor caso\nCompara��es: "+ heap.getComparacoes()+" Tempo: "+ heap.getTempo());
//		 heap.sort(arrayRandom);
//		 System.out.println("\nMédio caso\nCompara��es: "+ heap.getComparacoes()+" Tempo: "+ heap.getTempo());
//		 heap.sort(arrayPior);
//		 System.out.println("\nPior caso\nCompara��es: "+ heap.getComparacoes()+" Tempo: "+ heap.getTempo());
//		 System.out.println("----------------------------------------------------------------------------");
//
//		 arrayRandom = vet.Vetor(n);
//		 arrayPior = vet.VetorPiorCaso(n);
//		 arrayMelhor = vet.VetorMelhorCaso(n);
//		
//		 InsertionSort insertion = new InsertionSort();
//		 System.out.println("\n-----------Insertion----------");
//		 insertion.sort(arrayMelhor);
//		 System.out.println("\nMelhor caso\nCompara��es: "+ insertion.getComparacoes()+" Tempo: "+ insertion.getTempo());
//		 insertion.sort(arrayRandom);
//		 System.out.println("\nMédio caso\nCompara��es: "+ insertion.getComparacoes()+" Tempo: "+ insertion.getTempo());
//		 insertion.sort(arrayPior);
//		 System.out.println("\nPior caso\nCompara��es: "+ insertion.getComparacoes()+" Tempo: "+ insertion.getTempo());
//		 System.out.println("----------------------------------------------------------------------------");
//	
//		 arrayRandom = vet.Vetor(n);
//		 arrayPior = vet.VetorPiorCaso(n);
//		 arrayMelhor = vet.VetorMelhorCaso(n);
//		
//		 MergeSort merge = new MergeSort();
//		 System.out.println("\n-----------Merge----------");
//		 merge.sort(arrayMelhor);
//		 System.out.println("\nMelhor caso\nCompara��es: "+ merge.getComparacoes()+" Tempo: "+ merge.getTempo());
//		 merge.sort(arrayRandom);
//		 System.out.println("\nMédio caso\nCompara��es: "+ merge.getComparacoes()+" Tempo: "+ merge.getTempo());
//		 merge.sort(arrayPior);
//		 System.out.println("\nPior caso\nCompara��es: "+ merge.getComparacoes()+" Tempo: "+ merge.getTempo());
//		 System.out.println("----------------------------------------------------------------------------");
//
//		 arrayRandom = vet.Vetor(n);
//		 arrayPior = vet.VetorPiorCaso(n);
//		 arrayMelhor = vet.VetorMelhorCaso(n);
//		
//		 QuickSort quick = new QuickSort();
//		 System.out.println("\n-----------Quick----------");
//		 quick.sort(arrayMelhor,0,arrayMelhor.length -1);
//		 System.out.println("\nMelhor caso\nCompara��es: "+ quick.getComparacoes()+" Tempo: "+ quick.getTempo());
//		 quick.sort(arrayRandom,0,arrayRandom.length - 1);
//		 System.out.println("\nMédio caso\nCompara��es: "+ quick.getComparacoes()+" Tempo: "+ quick.getTempo());
//		 quick.sort(arrayPior,0,arrayPior.length - 1);
//		 System.out.println("\nPior caso\nCompara��es: "+ quick.getComparacoes()+" Tempo: "+ quick.getTempo());
//		
//		 arrayRandom = vet.Vetor(n);
//		 arrayPior = vet.VetorPiorCaso(n);
//		 arrayMelhor = vet.VetorMelhorCaso(n);
//		
//		 ShellSort shell = new ShellSort();
//		 System.out.println("\n-----------Shell----------");
//		 shell.sort(arrayMelhor);
//		 System.out.println("\nMelhor caso\nCompara��es: "+ shell.getComparacoes()+" Tempo: "+ shell.getTempo());
//		 shell.sort(arrayRandom);
//		 System.out.println("\nMédio caso\nCompara��es: "+ shell.getComparacoes()+" Tempo: "+ shell.getTempo());
//		 shell.sort(arrayPior);
//		 System.out.println("\nPior caso\nCompara��es: "+ shell.getComparacoes()+" Tempo: "+ shell.getTempo());
    }

    public static long[][] Bubble(int n) {
        Vetor vet = new Vetor();

        int arrayRandom[] = vet.Vetor(n);
        int arrayPior[] = vet.VetorPiorCaso(n);
        int arrayMelhor[] = vet.VetorMelhorCaso(n);

        int comparação = 0;
        long tempo;
        long[] tempoVet = new long[3];
        int[] comp = new int[3];
        BubbleSort bubble = new BubbleSort();
        
        for (int i = 0; i < 10; i++) {
            bubble.bubbleSort(arrayMelhor);
            comparação = bubble.getComparacoes();
            tempo = bubble.getTempo();
            comp[0] = comp[0] + comparação;
            tempoVet[0] = tempoVet[0] + tempo;

            bubble.bubbleSort(arrayRandom);
            comparação = bubble.getComparacoes();
            tempo = bubble.getTempo();
            comp[1] = comp[1] + comparação;
            tempoVet[1] = tempoVet[1] + tempo;

            bubble.bubbleSort(arrayPior);
            comparação = bubble.getComparacoes();
            tempo = bubble.getTempo();
            comp[2] = comp[2] + comparação;
            tempoVet[2] = tempoVet[2] + tempo;
        }

        return media(comp, tempoVet);
    }

    public static long[][] media(int[] comparacao, long[] tempo) {
        long[][] media = new long[3][3];

        for (int i = 0; i < 3; i++) {
            for(int j=0;j<1;j++){
                media[i][j] = comparacao[i] / 10;
                media[i][j+1] = (long) (tempo[i] / 0.10);
            }
        }

        return media;
    }
}
