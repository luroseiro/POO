package ADO_08;

public class Main {

    public static void main(String[] args) {

        System.out.println("EXEMPLO 1: (x = 5 e y = 2)\n");
        NumeroInteiro a = new NumeroInteiro(5);
        NumeroInteiro b = new NumeroInteiro(2);

        a.soma(b.getNumero());
        a.subtrai(b.getNumero());
        a.multiplica(b.getNumero());
        a.divide(b.getNumero());
        System.out.println();

        System.out.println("EXEMPLO 2: (x = 4 e y = 0)\n");
        NumeroInteiro c = new NumeroInteiro(4);
        NumeroInteiro d = new NumeroInteiro(0);

        c.soma(d.getNumero());
        c.subtrai(d.getNumero());
        c.multiplica(d.getNumero());
        c.divide(d.getNumero());

    }

}
