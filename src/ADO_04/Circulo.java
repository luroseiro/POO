package ADO_04;

class Circulo extends Figura {

    Circulo(int raio) {

        this.area = Math.PI * Math.pow(raio, 2);
        this.perimetro = 2 * Math.PI * raio;

    }

}
