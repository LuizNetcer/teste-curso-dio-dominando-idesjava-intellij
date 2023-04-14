package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprograma {
    public static void main(String[] args) {
        gato gato = new gato();
        System.out.println(gato);
        livro livro = new livro("o problema dos tres corpos", 300);
        /*int a = 5;
        int b = 3;
        System.out.println("hello world! " + (a+b));*/
    }
}
class livro{
    private string nome;
    private integer numpag;

    public livro(string nome, integer numpag) {
        this.nome = nome;
        this.numpag = numpag;
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public integer getNumpag() {
        return numpag;
    }

    public void setNumpag(integer numpag) {
        this.numpag = numpag;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome=" + nome +
                ", numpag=" + numpag +
                '}';
    }
}
