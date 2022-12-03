package Exercicio1.Metodos;

import Exercicio1.arraySortStrategy;

public class selectionSort implements arraySortStrategy {
    public static void main(String[] args){

        int quantidade = 10000;
        int[] vetor = new int[quantidade];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
        }

        long tempoInicial = System.currentTimeMillis();

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }
    @Override
    public int[] metodo(int[] vetor) {
        for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < vetor.length; i++) {
                if (vetor[i] < vetor[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = vetor[fixo];
                vetor[fixo] = vetor[menor];
                vetor[menor] = t;
            }
        }
        return vetor;
    }
}
