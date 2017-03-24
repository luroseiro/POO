package ADO_04;

class TrianguloIsoceles extends Triangulo {

    TrianguloIsoceles(int lado, int base, int altura) {

        this.perimetro = lado * 2 + base;
        this.area = (altura * base) / 2;

    }

}

