package ADO_01;

public class Main {

    private static int[] geraNumeros(int contaPrimos, int numeros[]) {

        int primeiroNumero = 1;
        int segundoNumero = 1;
        int terceiroNumero = 1;
        int proximoNumero;
        int i = 0;

        while(contaPrimos < 5) {
            proximoNumero = segundoNumero + primeiroNumero;
            repetido:
            if(verificaPrimo(proximoNumero)) {
                for (int numero : numeros) {
                    if (numero == proximoNumero) {
                        break repetido;
                    }
                }
                contaPrimos++;
                numeros[i] = proximoNumero;
                i++;
            }
            primeiroNumero = segundoNumero;
            segundoNumero = terceiroNumero;
            terceiroNumero = proximoNumero;
        }

        return numeros;
    }

    private static boolean verificaPrimo (int numero) {

        int divisor = 2;
        boolean primo = true;

        if(numero <= 1)
            primo = false;

        while(primo && divisor <= numero / 2) {
            if(numero % divisor == 0)
                primo = false;
            divisor++;
        }
        return primo;

    }

    public static void main(String[] args) {

        int contaPrimos = 0;
        int numeros[];
        numeros = new int[5];
        numeros = geraNumeros(contaPrimos, numeros);
        System.out.print("Os 5 primeiros números primos da sequência de Padovan são: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

    }

}

