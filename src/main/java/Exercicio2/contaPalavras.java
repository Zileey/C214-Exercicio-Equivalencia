package Exercicio2;

import Exercicio2.Observavel.impl.Observador;
import Exercicio2.Observavel.impl.Observavel;

public class contaPalavras {
    public static void main(String[] args) {

        //Criando subject
        Observavel contador = new Observavel();

        //Criando observadores e regitrando

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        contador.registroObservador(obs1);
        contador.registroObservador(obs2);
        contador.registroObservador(obs3);

        //Contador de Palavras
        String texto = "O rato roeu a roupa do rei de Roma";
        int maiusculas = 0, quant = 0, quantPar = 0;
        for (int i = 0; i < texto.length(); i++) { // para todos os caracteres da string
            char c = texto.charAt(i); // pegar o caractere
            if (Character.isUpperCase(c)) {
                maiusculas++;
            }
            }

        String [] arrayString = texto.split(" ");

        for(int i=0;i<arrayString.length;i++){
            quant++;
            if(arrayString.length % 2 == 0){
                quantPar++;
            }

        }

        contador.setNovoAnuncioDeContagem("Total",quant);
        contador.setNovoAnuncioDeContagem("Pares",quantPar);
        contador.setNovoAnuncioDeContagem("Maiusculas",maiusculas);

        System.out.println("Mandando notificação para todos os contadores");
        contador.notificaObservadores();
    }



}
