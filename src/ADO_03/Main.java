package ADO_03;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int tempo = 0, idJogador, idTime, auxTime = -1, auxJogador = -1;
        Random random = new Random();

        Times timeA = new Times("Santos F.C.", "Dorival Jr.");
        Times timeB = new Times("Barcelona F.C.", "Luis Enrique");

        while(tempo <= 90) {

            idJogador = random.nextInt(11);
            idTime = random.nextInt(2) + 1;
            if(idTime != auxTime) {
                auxTime = idTime;
                if(idTime == 1) {
                    timeB.resetTempoBola();
                    for (int i = 0; i < timeB.getJogadores().length; i++) {
                        timeB.getJogadores()[i].setBola(false);
                    }
                    timeA.getJogadores()[idJogador].setBola(true);
                }
                else {
                    timeA.resetTempoBola();
                    for (int i = 0; i < timeA.getJogadores().length; i++) {
                        timeA.getJogadores()[i].setBola(false);
                    }
                    timeB.getJogadores()[idJogador].setBola(true);
                }
            }
            else {
                if(idTime == 1) {
                    timeA.setTempoBola();
                    if(idJogador != auxJogador) {
                        auxJogador = idJogador;
                        for(int i = 0; i < timeA.getJogadores().length; i++) {
                            timeA.getJogadores()[i].setBola(false);
                        }
                        timeA.getJogadores()[idJogador].setBola(true);
                    }

                    if(timeA.getTempoBola() == 3) {
                        timeA.resetTempoBola();
                        timeA.setGolsFeitos();
                    }
                }
                else {
                    timeB.setTempoBola();
                    if(idJogador != auxJogador) {
                        auxJogador = idJogador;
                        for(int i = 0; i < timeB.getJogadores().length; i++) {
                            timeB.getJogadores()[i].setBola(false);
                        }
                        timeB.getJogadores()[idJogador].setBola(true);
                    }

                    if(timeB.getTempoBola() == 3) {
                        timeB.resetTempoBola();
                        timeB.setGolsFeitos();
                    }
                }
            }

            System.out.println("MINUTO: " + tempo);
            System.out.println("Placar: " + timeA.getGolsFeitos() + " x " + timeB.getGolsFeitos());

            tempo++;
        }

    }

}

