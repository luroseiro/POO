package ADO_08;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exemplo 1: (x = 5 e y = 2)\n");
        NumeroInteiro ex1 = new NumeroInteiro(5, 2);
        ex1.soma();
        ex1.subtrai();
        ex1.multiplica();
        ex1.divide();
        System.out.println();

        System.out.println("Exemplo 2: (x = 4 e y = 0)\n");
        NumeroInteiro ex2 = new NumeroInteiro(4,0);
        ex2.soma();
        ex2.subtrai();
        ex2.multiplica();
        ex2.divide();

    }

}
