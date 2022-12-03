package Exercicio1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TesteOpcoes {

    opcoes Opcoes;

    @Test
    public void testeBubble(){
        Opcoes = new usandoBubble();
        assertTrue(Opcoes.getSort() instanceof usandoBubble);
    }

    @Test
    public void testeInsertion(){
        Opcoes = new usandoInsertion();
        assertTrue(Opcoes.getSort() instanceof usandoInsertion);
    }

    @Test
    public void testeSelection(){
        Opcoes = new usandoSelection();
        assertTrue(Opcoes.getSort() instanceof usandoSelection);
    }

    @Test
    public void testeInsertionNull(){
        Opcoes = new usandoInsertion();
        int[] vetor = Opcoes.metodo(new int[]{10});
        assertArrayEquals(new int[]{0}, new int[]{10});
    }
}
