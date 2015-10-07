package exe6;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by psilva on 9/19/15.
 */
public class Exercicio6 {
    private String nome;

    public Exercicio6() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Exercicio6 exe6 = (Exercicio6) Class.forName("exe6.Exercicio6")
                .getConstructor()
                .newInstance();

      //  Class exe6 = Exercicio6.class;

        exe6.setNome("Pedro");
        System.out.print(exe6);
    }
}
