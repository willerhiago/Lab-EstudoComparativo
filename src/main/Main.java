package main;

import comparacao.Calculo;
import comparacao.Comparacao;
import sorts.*;

public class Main {

    public static void main(String[] args) {
    	
    	Comparacao comp = new Comparacao();
    	int tamArray = 400000;
    	int n  = 100; //quantidade de iteracoes
    	//comp.bubble(tamArray, n);
        //comp.heap(tamArray, n);
    	//comp.insertion(tamArray, n);
    	//comp.merge(tamArray, n);
    	//comp.quick(tamArray, n);
    	//comp.selection(tamArray, n);
    	comp.shell(tamArray, n);
    }
}
