package ADO_04;

class Losango extends Paralelogramo{

    Losango(int lado, int diagonalMaior, int diagonalMenor) {

        this.area = diagonalMaior * diagonalMenor / 2;
        this.perimetro = 4 * lado;

    }

}

