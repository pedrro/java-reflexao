package exe2;

/**
 * Created by psilva on 9/18/15.
 */
public class Cachorro extends Animal {

    private Cachorro() {
    }



    public static Animal criar(){
        return new Cachorro() ;
    }



}
