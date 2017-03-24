package ADO_04;

class Paralelogramo extends Figura {

    protected int lado1;
    protected int lado2;
    protected int altura;

    Paralelogramo(int base, int lado, int altura) {

        this.perimetro = base * 2 + lado * 2;
        this.area = (base * altura);

    }

    Paralelogramo() {

    }

}

