package exe11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by psilva on 9/19/15.
 */
public class Exercicio11 {
    private String nome;
    String endereco;
    public int idade;

    public Exercicio11() {
    }

    public Exercicio11(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



}
