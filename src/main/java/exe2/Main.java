package exe2;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Animal ponteiro = new Galinha();

        System.out.println(Animal.class);
        System.out.println(ponteiro.getClass());
    }

    public static class Galinha extends Animal {

        public void coco() {
            System.out.println("cocó");
        }

    }
}
