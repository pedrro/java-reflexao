package exe8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * Created by psilva on 9/19/15.
 */
public class Exercicio8 {

    public void helloWorld(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = Class.forName("exe8.Exercicio8");

        Method method = c.getMethod("helloWorld");
        Object o = method.invoke(c.newInstance());

    }
}
