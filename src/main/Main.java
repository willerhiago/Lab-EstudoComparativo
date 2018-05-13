package main;

import sorts.*;

public class Main {

    public static void main(String[] args) {
        ComparacaoTeste comp = new ComparacaoTeste();
        int[] array = new int [5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 12;
        array[3] = 17;
        array[4] = 16;
        comp.calculaMediaEDesvio(array);
        System.out.println(comp.getDesvioPadrao());
        System.out.println(comp.getMedia());
//        int n = 1000;
//        for (int i = 0; i < 10; i++) {
//            long[][] resultado = comp.Bubble(n);
//            System.out.println("\nMelhor caso\nCompara��es: " + resultado[0][0] + " Tempo: " + resultado[0][1]);
//            System.out.println("Médio caso\nCompara��es: " + resultado[1][0] + " Tempo: " + resultado[1][1]);
//            System.out.println("Pior caso\nCompara��es: " + resultado[2][0] + " Tempo: " + resultado[2][1]);
//            n = n + 1000;
//        }
//
//        System.out.println("----------------------------------------------------------------------------");
//        n = 500;
//        for (int i = 0; i < 10; i++) {
//            long[][] resultado = comp.selection(n);
//            System.out.println("\nMelhor caso\nCompara��es: " + resultado[0][0] + " Tempo: " + resultado[0][1]);
//            System.out.println("\nMédio caso\nCompara��es: " + resultado[1][0] + " Tempo: " + resultado[1][1]);
//            System.out.println("\nPior caso\nCompara��es: " + resultado[2][0] + " Tempo: " + resultado[2][1]);
//            n = n + 1000;
//        }
//
//        System.out.println("----------------------------------------------------------------------------");
//        n = 1000;
//        for (int i = 0; i < 10; i++) {
//            long[][] resultado = comp.heap(n);
//            System.out.println("\nMelhor caso\nCompara��es: " + resultado[0][0] + " Tempo: " + resultado[0][1]);
//            System.out.println("\nMédio caso\nCompara��es: " + resultado[1][0] + " Tempo: " + resultado[1][1]);
//            System.out.println("\nPior caso\nCompara��es: " + resultado[2][0] + " Tempo: " + resultado[2][1]);
//            n = n + 1000;
//        }
//
//        System.out.println("----------------------------------------------------------------------------");
//        n = 1000;
//        for (int i = 0; i < 10; i++) {
//            long[][] resultado = comp.insert(n);
//            System.out.println("\nMelhor caso\nCompara��es: " + resultado[0][0] + " Tempo: " + resultado[0][1]);
//            System.out.println("\nMédio caso\nCompara��es: " + resultado[1][0] + " Tempo: " + resultado[1][1]);
//            System.out.println("\nPior caso\nCompara��es: " + resultado[2][0] + " Tempo: " + resultado[2][1]);
//            n = n + 1000;
//        }
//
//        System.out.println("----------------------------------------------------------------------------");
//        n = 1000;
//        for (int i = 0; i < 10; i++) {
//            long[][] resultado = comp.merge(n);
//            System.out.println("\nMelhor caso\nCompara��es: " + resultado[0][0] + " Tempo: " + resultado[0][1]);
//            System.out.println("\nMédio caso\nCompara��es: " + resultado[1][0] + " Tempo: " + resultado[1][1]);
//            System.out.println("\nPior caso\nCompara��es: " + resultado[2][0] + " Tempo: " + resultado[2][1]);
//            n = n + 1000;
//        }
//
//        System.out.println("----------------------------------------------------------------------------");
//        n = 1000;
//        for (int i = 0; i < 10; i++) {
//            long[][] resultado = comp.quick(n);
//            System.out.println("\nMelhor caso\nCompara��es: " + resultado[0][0] + " Tempo: " + resultado[0][1]);
//            System.out.println("\nMédio caso\nCompara��es: " + resultado[1][0] + " Tempo: " + resultado[1][1]);
//            System.out.println("\nPior caso\nCompara��es: " + resultado[2][0] + " Tempo: " + resultado[2][1]);
//            n = n + 1000;
//        }
//
//        System.out.println("----------------------------------------------------------------------------");
//        n = 1000;
//        for (int i = 0; i < 10; i++) {
//            long[][] resultado = comp.shell(n);
//            System.out.println("\nMelhor caso\nCompara��es: " + resultado[0][0] + " Tempo: " + resultado[0][1]);
//            System.out.println("\nMédio caso\nCompara��es: " + resultado[1][0] + " Tempo: " + resultado[1][1]);
//            System.out.println("\nPior caso\nCompara��es: " + resultado[2][0] + " Tempo: " + resultado[2][1]);
//            n = n + 1000;
//        }
    }
}
