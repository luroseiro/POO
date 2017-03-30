package ADO_05;

class Gato extends Animal {

    @Override
    public void movimentar() {
        System.out.println("Gato andando");
    }

    @Override
    public void som() {
        System.out.println("Gato: miau! meow! ronrom!");
    }

}
