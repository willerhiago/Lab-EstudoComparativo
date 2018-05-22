package main;

import comparacao.Calculo;
import comparacao.Comparacao;
import sorts.*;

public class Main {

    public static void main(String[] args) {
    	
    	Comparacao comp = new Comparacao();
    	int tamArray = 10000;
    	int n  = 10; //quantidade de iteracoes
    	//comp.bubble(tamArray, n);
        //comp.heap(tamArray, n);
    	//comp.insertion(tamArray, n);
    	//comp.merge(tamArray, n);
    	//comp.quick(tamArray, n - 1);
    	//comp.selection(tamArray, n);
    	//comp.shell(tamArray, n);
    	
    	for(int i = 0; i < 10; i ++) {
        	comp.selection(tamArray, n);
        	tamArray += 10000;
    	}
//    	SelectionSort s = new SelectionSort(); 
//    	Vetor piorcaso = new Vetor();
//    	int[] piorCaso2 = piorcaso.VetorPiorCaso(tamArray);
//    	
//    	s.sort(piorCaso2);
//    	System.out.println(s.getTrocas());
    }
}
