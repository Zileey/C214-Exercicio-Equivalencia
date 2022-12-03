package Exercicio1;

public abstract class opcoes {

    protected arraySortStrategy sort;

    public int[] metodo(int vetor[]) {return sort.metodo(vetor);};

    public arraySortStrategy getSort() {
        return sort;
    }

    public void setSort(arraySortStrategy sort) {
        this.sort = sort;
    }
}
