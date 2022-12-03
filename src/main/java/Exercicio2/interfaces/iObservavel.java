package Exercicio2.interfaces;

import Exercicio2.Observavel.impl.Observador;

public interface iObservavel {
    public void registroObservador(Observador obs);
    public void removeObservador(Observador obs);
    public void notificaObservadores();
}
