package ADO_04;

class TrianguloRetangulo extends Triangulo {

    TrianguloRetangulo(int base, int altura, int lado) {

        this.perimetro = base + altura + lado;
        this.area = (altura * base) / 2;

    }

}

