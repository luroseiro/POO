package ADO_04;

class Retangulo extends Paralelogramo{

    Retangulo(int lado1, int lado2) {

        this.perimetro = lado1 * 2 + lado2 * 2;
        this.area = lado1 * lado2;

    }

}

