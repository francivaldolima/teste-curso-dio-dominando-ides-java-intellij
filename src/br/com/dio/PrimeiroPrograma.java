package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.println("Hello World " + ( a + b));

        Gato gato = new Gato();
        Livro livro = new Livro("Java ",123);
        System.out.println(livro);
    }
}

class Livro{

    private String nome;
    private Integer numPage;

    public Livro(String nome, Integer numPage) {
        this.nome = nome;
        this.numPage = numPage;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPage() {
        return numPage;
    }

    public void setNumPage(Integer numPage) {
        this.numPage = numPage;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPage=" + numPage +
                '}';
    }
}
