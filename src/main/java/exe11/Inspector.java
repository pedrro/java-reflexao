package exe11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Inspector {

    private String returnModifier(int modifier){
        if(modifier ==0){
            return "Sem modificador";
        }else if(modifier==1){
            return  "Public";
        }else{
            return "Private";
        }
    }

    public void inspect(Object e11){
        Class e11Class = e11.getClass();
        System.out.println("Nome da classe: " + e11Class.getSimpleName());

        Field[] fields = e11Class.getDeclaredFields();
        System.out.println("Nome de campos:");

        for(Field field : fields){
            String modifier = null;

            System.out.print(returnModifier(field.getModifiers())+ " ");
            System.out.print(field.getType().getSimpleName() + " ");
            System.out.println(field.getName());
        }

        Constructor[] constructors = e11Class.getDeclaredConstructors();
        System.out.println("Construtores:");

        for(Constructor c : constructors){
            System.out.println(c.getName());
            System.out.println(c.getParameterCount());
        }

        Method[] methods = e11Class.getDeclaredMethods();
        System.out.println("Metodos:");
        for(Method m : methods){
            System.out.print(returnModifier(m.getModifiers()) + " ");
            System.out.print(m.getGenericReturnType() + " ");
            System.out.println(m.getName());
        }

    }

}
