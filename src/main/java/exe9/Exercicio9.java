package exe9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by psilva on 9/19/15.
 */
public class Exercicio9 {

    public void helloWorld(String nome, int idade){
        System.out.println("Hello "+ nome + "\n"+ idade);
    }
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = Class.forName("exe9.Exercicio9");

        Method method = c.getMethod("helloWorld",java.lang.String.class, int.class);
        Object o = method.invoke(c.newInstance(),"Pedro",10);

    }
}
