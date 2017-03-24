package ADO_02;

class Fibonacci {

    int calculaFibonacci(int numero) {
        if(numero < 2) {
            return numero;
        }
        else {
            return calculaFibonacci(numero - 1) + calculaFibonacci(numero - 2);
        }
    }

}
