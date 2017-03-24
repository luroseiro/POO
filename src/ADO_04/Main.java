package ADO_04;

public class Main {

    public static void main(String[] args) {

        Paralelogramo paralelogramo = new Paralelogramo(2,5,6);
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(5,2);
        Losango losango = new Losango(4,6,5);
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo(3,4,5);
        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(3);
        TrianguloIsoceles trianguloIsoceles = new TrianguloIsoceles(3,2,5);
        Circulo circulo = new Circulo(3);

        System.out.println("Area do paralelogramo: " + paralelogramo.area);
        System.out.println("Perimetro do paralelogramo: " + paralelogramo.perimetro);
        System.out.println("Area do quadrado: " + quadrado.area);
        System.out.println("Perimetro do quadrado: " + quadrado.perimetro);
        System.out.println("Area do retangulo: " + retangulo.area);
        System.out.println("Perimetro do retangulo: " + retangulo.perimetro);
        System.out.println("Area do losango: " + losango.area);
        System.out.println("Perimetro do losango: " + losango.perimetro);
        System.out.println("Area do circulo: " + circulo.area);
        System.out.println("Perimetro do circulo: " + circulo.perimetro);
        System.out.println("Area do triangulo equilatero: " + trianguloEquilatero.area);
        System.out.println("Perimetro do triangulo equilatero: " + trianguloEquilatero.perimetro);
        System.out.println("Area do triangulo isoceles: " + trianguloIsoceles.area);
        System.out.println("Perimetro do triangulo isoceles: " + trianguloIsoceles.perimetro);
        System.out.println("Area do triangulo retangulo: " + trianguloRetangulo.area);
        System.out.println("Perimetro do triangulo retangulo: " + trianguloRetangulo.perimetro);

    }

}

