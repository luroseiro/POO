package ADO_04;

class Quadrado extends Paralelogramo {

    Quadrado(int lado) {

        this.perimetro = 4 * lado;
        this.area = Math.pow(lado, 2);

    }

}
