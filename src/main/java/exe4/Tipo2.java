package exe4;

/**
 * Created by psilva on 9/19/15.
 */
public class Tipo2 {
    public static void main(String[]args) throws ClassNotFoundException {
        Tipo2 tipo = new Tipo2();
        Class c1 = tipo.getClass();
        Class c2 = Tipo2.class;
        Class c3 = Class.forName("exe4.Tipo2");
        System.out.println(c1 + "\n"+ c2+ "\n"+c3+ "\n");
    }



}
