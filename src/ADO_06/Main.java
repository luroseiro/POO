package ADO_06;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>();

        for(int i = 0; i <= 125; i += 5) {
            numeros.add(i);
        }

        System.out.println("HashSet:");
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        LinkedHashSet<Integer> numerosLinked = new LinkedHashSet<>();

        for(int i = 0; i <= 125; i += 5) {
            numerosLinked.add(i);
        }

        System.out.println("LinkedHashSet:");
        for(Integer numero : numerosLinked) {
            System.out.print(numero + " ");
        }
        System.out.println();

    }

}
