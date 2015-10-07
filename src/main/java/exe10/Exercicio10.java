package exe10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by psilva on 9/19/15.
 */
public class Exercicio10 {

    public String helloWorld(String nome, int idade){
        return nome +" "+ idade;
    }
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = Class.forName("exe10.Exercicio10");

        Method method = c.getMethod("helloWorld",java.lang.String.class, int.class);
        String o = (String) method.invoke(c.newInstance(),"Pedro",10);

        System.out.print(o);
    }
}
