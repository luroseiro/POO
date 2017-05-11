package ADO_10;

import java.util.Random;

class Kart extends Thread {

    private String piloto;
    private int velocidade;

    Kart(String piloto) {
        this.piloto = piloto;
        Random random = new Random();
        this.velocidade = random.nextInt(50) + 1;
        start();
    }

    public void run() {
        try {
            for(int i = 1; i <= 10; i++) {
                System.out.println(piloto + " terminou a volta " + i);
                Thread.sleep(100 - velocidade);
            }
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        System.out.println(piloto + " terminou a corrida com velocidade de " + velocidade + " km/h.");
    }

}
