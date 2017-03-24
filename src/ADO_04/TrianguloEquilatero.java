package ADO_04;

class TrianguloEquilatero extends Triangulo{

    TrianguloEquilatero(int lado) {

        double altura;
        altura = lado / 2 * Math.sqrt(3);
        this.perimetro = lado * 3;
        this.area = (altura * lado) / 2;

    }

}

