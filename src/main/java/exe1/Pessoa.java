package exe1;

/**
 * Created by psilva on 9/18/15.
 */
public class Pessoa {
    String nome;
    int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   public static void main(String[]args){
       Pessoa p = new Pessoa("pedro",22);

       System.out.print(p.getClass());
   }
}
