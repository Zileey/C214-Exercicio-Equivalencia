package Exercicio2;

import Exercicio2.Observavel.impl.Observador;
import Exercicio2.Observavel.impl.Observavel;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestContaPalavras {
    contaPalavras contadorDePalavras;

    @Test
    public void testeContadores(){
        Observavel contadores = new Observavel();
        Observador obs1 = new Observador(1);
        contadores.registroObservador(obs1);
        assertTrue(!contadores.getContadores().isEmpty());
    }

    @Test
    public void teste3Observadores(){
        Observavel contadores = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        contadores.registroObservador(obs1);
        contadores.registroObservador(obs2);
        contadores.registroObservador(obs3);
        assertEquals(contadores.getContadores().size(),3);
    }

    @Test
    public void listaIncritosVazia(){
        Observavel contadores = new Observavel();
        Observador obs1 = new Observador(1);
        contadores.registroObservador(obs1);
        assertEquals(contadores.getContadores().size(),0);
    }
}
