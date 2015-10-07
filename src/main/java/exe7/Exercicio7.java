package exe7;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by psilva on 9/19/15.
 */
public class Exercicio7 {
    private String nome, endereco;

    public Exercicio7(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
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

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Exercicio7 exe7 = (Exercicio7) Class.forName("exe7.Exercicio7")
                .getConstructor(String.class, String.class)
                .newInstance("Pedro", "Rua 10");

        //  Class exe6 = Exercicio6.class;


        System.out.print(exe7.getNome() +"\n" + exe7.getEndereco());
    }
}
