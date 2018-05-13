package main;

import comparacao.Calculo;
import comparacao.Comparacao;
import sorts.*;

public class Main {

    public static void main(String[] args) {
    	
    	Comparacao comp = new Comparacao();
    	int tamArray = 1000;
    	int n  = 100; //quantidade de iteracoes
    	//comp.bubble(tamArray, n);
        //comp.heap(tamArray, n);
    	comp.insertion(tamArray, n);
    }
}
