package Exercicio2.Observavel.impl;

import Exercicio2.interfaces.iObservador;

public class Observador implements iObservador {

    int id;

    //construtor
    public Observador(int id){
        this.id = id;
    }

    @Override
    public void update(Observavel contador) {
        System.out.println("Contador Número: "+this.id);
        System.out.println("Tipo: "+ contador.getTipo());
        System.out.println("Total: "+ contador.getNum());

    }
}
