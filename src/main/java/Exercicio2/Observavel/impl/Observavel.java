package Exercicio2.Observavel.impl;

import Exercicio2.interfaces.iObservavel;
import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel {

    String tipo;
    int num;
    private List<Observador> contadores;

    public Observavel(){
        contadores = new ArrayList<Observador>();
    }

    @Override
    public void registroObservador(Observador obs) {
        contadores.add();
    }

    @Override
    public void removeObservador(Observador obs) {
        if(contadores.contains(obs))
            contadores.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for(Observador observador : contadores){
            observador.update(this);
        }
    }

    //Esse método é chamado sempre que os valores
    //se modificacam
    private void novasMedidas() {
        notificaObservadores();
    }

    public void setNovoAnuncioDeContagem(String tipo, int num){
        if(tipo.equals("Total")){
            System.out.println("Número total de palavras:");
            this.num = num;
            novasMedidas();
        } else if (tipo.equals("Pares")) {
            System.out.println("Número de palavras com total de caracteres par:");
            this.num = num;
        } else if ("Maiusculas") {
            System.out.println("Número de palavras que começam com a letra maíuscula:");
            this.num = num;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<Observador> getContadores() {
        return contadores;
    }

    public void setContadores(List<Observador> contadores) {
        this.contadores = contadores;
    }
}
