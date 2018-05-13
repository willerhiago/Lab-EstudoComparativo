/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

/**
 *
 * @author Pedro
 */
public class Comparacao {

    public long[][] shell(int n) {
        Vetor vet = new Vetor();

        int arrayRandom[] = vet.Vetor(n);
        int arrayPior[] = vet.VetorPiorCaso(n);
        int arrayMelhor[] = vet.VetorMelhorCaso(n);

        int comparacao = 0;
        long tempo;
        long[] tempoVet = new long[3];
        int[] comp = new int[3];
        ShellSort shell = new ShellSort();

        for (int i = 0; i < 100; i++) {
            shell.sort(arrayMelhor);
            comparacao = shell.getComparacoes();
            tempo = shell.getTempo();
            comp[0] = comp[0] + comparacao;
            tempoVet[0] = tempoVet[0] + tempo;

            shell.sort(arrayRandom);
            comparacao = shell.getComparacoes();
            tempo = shell.getTempo();
            comp[1] = comp[1] + comparacao;
            tempoVet[1] = tempoVet[1] + tempo;

            shell.sort(arrayPior);
            comparacao = shell.getComparacoes();
            tempo = shell.getTempo();
            comp[2] = comp[2] + comparacao;
            tempoVet[2] = tempoVet[2] + tempo;
        }

        return media(comp, tempoVet);
    }

    public long[][] quick(int n) {
        Vetor vet = new Vetor();

        int arrayRandom[] = vet.Vetor(n);
        int arrayPior[] = vet.VetorPiorCaso(n);
        int arrayMelhor[] = vet.VetorMelhorCaso(n);

        int comparacao = 0;
        long tempo;
        long[] tempoVet = new long[3];
        int[] comp = new int[3];
        QuickSort quick = new QuickSort();

        for (int i = 0; i < 100; i++) {
            quick.sort(arrayMelhor, 0, arrayMelhor.length - 1);
            comparacao = quick.getComparacoes();
            tempo = quick.getTempo();
            comp[0] = comp[0] + comparacao;
            tempoVet[0] = tempoVet[0] + tempo;

            quick.sort(arrayRandom, 0, arrayRandom.length - 1);
            comparacao = quick.getComparacoes();
            tempo = quick.getTempo();
            comp[1] = comp[1] + comparacao;
            tempoVet[1] = tempoVet[1] + tempo;

            quick.sort(arrayPior, 0, arrayPior.length - 1);
            comparacao = quick.getComparacoes();
            tempo = quick.getTempo();
            comp[2] = comp[2] + comparacao;
            tempoVet[2] = tempoVet[2] + tempo;
        }

        return media(comp, tempoVet);
    }

    public long[][] merge(int n) {
        Vetor vet = new Vetor();

        int arrayRandom[] = vet.Vetor(n);
        int arrayPior[] = vet.VetorPiorCaso(n);
        int arrayMelhor[] = vet.VetorMelhorCaso(n);

        int comparacao = 0;
        long tempo;
        long[] tempoVet = new long[3];
        int[] comp = new int[3];
        MergeSort merge = new MergeSort();

        for (int i = 0; i < 100; i++) {
            merge.sort(arrayMelhor);
            comparacao = merge.getComparacoes();
            tempo = merge.getTempo();
            comp[0] = comp[0] + comparacao;
            tempoVet[0] = tempoVet[0] + tempo;

            merge.sort(arrayRandom);
            comparacao = merge.getComparacoes();
            tempo = merge.getTempo();
            comp[1] = comp[1] + comparacao;
            tempoVet[1] = tempoVet[1] + tempo;

            merge.sort(arrayPior);
            comparacao = merge.getComparacoes();
            tempo = merge.getTempo();
            comp[2] = comp[2] + comparacao;
            tempoVet[2] = tempoVet[2] + tempo;
        }

        return media(comp, tempoVet);
    }

    public long[][] selection(int n) {
        Vetor vet = new Vetor();

        int arrayRandom[] = vet.Vetor(n);
        int arrayPior[] = vet.VetorPiorCaso(n);
        int arrayMelhor[] = vet.VetorMelhorCaso(n);

        int comparacao = 0;
        long tempo;
        long[] tempoVet = new long[3];
        int[] comp = new int[3];
        SelectionSort selec = new SelectionSort();

        for (int i = 0; i < 100; i++) {
            selec.sort(arrayMelhor);
            comparacao = selec.getComparacoes();
            tempo = selec.getTempo();
            comp[0] = comp[0] + comparacao;
            tempoVet[0] = tempoVet[0] + tempo;

            selec.sort(arrayRandom);
            comparacao = selec.getComparacoes();
            tempo = selec.getTempo();
            comp[1] = comp[1] + comparacao;
            tempoVet[1] = tempoVet[1] + tempo;

            selec.sort(arrayPior);
            comparacao = selec.getComparacoes();
            tempo = selec.getTempo();
            comp[2] = comp[2] + comparacao;
            tempoVet[2] = tempoVet[2] + tempo;
        }

        return media(comp, tempoVet);
    }

    public long[][] insert(int n) {
        Vetor vet = new Vetor();
        int arrayRandom[] = vet.Vetor(n);
        int arrayPior[] = vet.VetorPiorCaso(n);
        int arrayMelhor[] = vet.VetorMelhorCaso(n);
        int comparacao = 0;
        long tempo;
        long[] tempoVet = new long[3];
        int[] comp = new int[3];
        InsertionSort insertion = new InsertionSort();

        for (int i = 0; i < 100; i++) {
            insertion.sort(arrayMelhor);
            comparacao = insertion.getComparacoes();
            tempo = insertion.getTempo();
            comp[0] = comp[0] + comparacao;
            tempoVet[0] = tempoVet[0] + tempo;

            insertion.sort(arrayRandom);
            comparacao = insertion.getComparacoes();
            tempo = insertion.getTempo();
            comp[1] = comp[1] + comparacao;
            tempoVet[1] = tempoVet[1] + tempo;

            insertion.sort(arrayPior);
            comparacao = insertion.getComparacoes();
            tempo = insertion.getTempo();
            comp[2] = comp[2] + comparacao;
            tempoVet[2] = tempoVet[2] + tempo;
        }
        return media(comp, tempoVet);
    }

    public long[][] heap(int n) {
        Vetor vet = new Vetor();
        int arrayRandom[] = vet.Vetor(n);
        int arrayPior[] = vet.VetorPiorCaso(n);
        int arrayMelhor[] = vet.VetorMelhorCaso(n);
        int comparacao = 0;
        long tempo;
        long[] tempoVet = new long[3];
        int[] comp = new int[3];
        HeapSort heap = new HeapSort();

        for (int i = 0; i < 100; i++) {
            heap.sort(arrayMelhor);
            comparacao = heap.getComparacoes();
            tempo = heap.getTempo();
            comp[0] = comp[0] + comparacao;
            tempoVet[0] = tempoVet[0] + tempo;

            heap.sort(arrayRandom);
            comparacao = heap.getComparacoes();
            tempo = heap.getTempo();
            comp[1] = comp[1] + comparacao;
            tempoVet[1] = tempoVet[1] + tempo;

            heap.sort(arrayPior);
            comparacao = heap.getComparacoes();
            tempo = heap.getTempo();
            comp[2] = comp[2] + comparacao;
            tempoVet[2] = tempoVet[2] + tempo;
        }

        return media(comp, tempoVet);
    }

    public long[][] Bubble(int n) {
        Vetor vet = new Vetor();

        int arrayRandom[] = vet.Vetor(n);
        int arrayPior[] = vet.VetorPiorCaso(n);
        int arrayMelhor[] = vet.VetorMelhorCaso(n);

        int comparacao = 0;
        long tempo;
        long[] tempoVet = new long[3];
        int[] comp = new int[3];
        BubbleSort bubble = new BubbleSort();

        for (int i = 0; i < 100; i++) {
            bubble.bubbleSort(arrayMelhor);
            comparacao = bubble.getComparacoes();
            tempo = bubble.getTempo();
            comp[0] = comp[0] + comparacao;
            tempoVet[0] = tempoVet[0] + tempo;

            bubble.bubbleSort(arrayRandom);
            comparacao = bubble.getComparacoes();
            tempo = bubble.getTempo();
            comp[1] = comp[1] + comparacao;
            tempoVet[1] = tempoVet[1] + tempo;

            bubble.bubbleSort(arrayPior);
            comparacao = bubble.getComparacoes();
            tempo = bubble.getTempo();
            comp[2] = comp[2] + comparacao;
            tempoVet[2] = tempoVet[2] + tempo;
        }
        return media(comp, tempoVet);
    }

    private long[][] media(int[] comparacao, long[] tempo) {
        long[][] media = new long[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                media[i][j] = comparacao[i] / 10;
                media[i][j + 1] = (long) (tempo[i] / 10);
            }
        }
        
        return media;
    }
    
    private int[][] Variancia(long[][] media, int[] comp, long[] tempo) {
        int[][] variancia = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                variancia[i][j] = (int) Math.pow(media[i][j] - comp[i], 2) / 10 - 1;
                variancia[i][j + 1] = (int) Math.pow(media[i][j+1] - tempo[i], 2) / 10 - 1;
            }
        }
        
        return DesvioPadrao(variancia);
    }
    
    private int[][] DesvioPadrao(int[][] variancia){
        int[][] Desvio = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                Desvio[i][j] = (int) Math.sqrt(Math.pow(variancia[i][j],2));
                Desvio[i][j + 1] = (int) Math.sqrt(Math.pow(variancia[i][j+1],2));
            }
        }
       return Desvio; 
    }
    
    public void teste(){
        
    } 
}
