package ADO_08;

class NumeroInteiro {

    private int numero;
    public int getNumero() {
        return  numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    NumeroInteiro(int numero) {
        this.numero = numero;
    }

    public void soma(int y) {
        System.out.println(numero + " + " + y + " = " + (numero + y));
    }
    public void subtrai(int y) {
        System.out.println(numero + " - " + y + " = " + (numero - y));
    }
    public void multiplica(int y) {
        System.out.println(numero + " * " + y + " = " + (numero * y));
    }
    public void divide(int y) {
        try {
            System.out.println(numero + " / " + y + " = " + (numero / y) + " (divisão inteira)");
        }
        catch (ArithmeticException e) {
            System.out.println("ERRO -> " + e.getMessage());
        }
    }

}
