package ADO_05;

public class Cachorro extends Animal {

    @Override
    public void movimentar() {
        System.out.println("Cachorro correndo!");
    }

    @Override
    public void som() {
        System.out.println("Cachorro: au! au! au! au! rrrrr!");
    }

}
