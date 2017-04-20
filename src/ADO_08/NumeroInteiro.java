package ADO_08;

class NumeroInteiro {

    private int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    private int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    NumeroInteiro(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void soma() {
        System.out.println(x + " + " + y + " = " + (x + y));
    }
    public void subtrai() {
        System.out.println(x + " - " + y + " = " + (x - y));
    }
    public void multiplica() {
        System.out.println(x + " * " + y + " = " + (x * y));
    }
    public void divide() {
        try {
            System.out.println(x + " / " + y + " = " + (x / y) + " (divisão inteira)");
        }
        catch (ArithmeticException e) {
            System.out.println("ERRO -> " + e.getMessage());
        }
    }

}
