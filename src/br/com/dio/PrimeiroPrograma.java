package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);
        System.out.println("O nome do gato é: " + gato.getNome());
        System.out.println("A cor do gato é: " + gato.getCor());
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World Java com IntelliJ : " + (a + b));*/
    }
}
