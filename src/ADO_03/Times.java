package ADO_03;

class Times {

    private int golsFeitos;
    int getGolsFeitos() {
        return golsFeitos;
    }
    void setGolsFeitos() {
        this.golsFeitos++;
    }

    private int tempoBola = 0;
    int getTempoBola() {
        return tempoBola;
    }
    void setTempoBola() {
        this.tempoBola++;
    }
    void resetTempoBola() {
        this.tempoBola = 0;
    }

    private String nome;
    private String tecnico;

    private Jogadores[] jogadores;
    Jogadores[] getJogadores() {
        return jogadores;
    }

    //construtor
    Times(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.golsFeitos = 0;

        //cria jogadores
        this.jogadores = new Jogadores[11];
        for(int i = 0; i < jogadores.length; i++) {
            this.jogadores[i] = new Jogadores();
            if(i == 0) {
                this.jogadores[i].setPosicao("Goleiro");
                this.jogadores[i].setNumero(1);
            }
            else if(i == 1) {
                this.jogadores[i].setPosicao("Lateral esquerdo");
                this.jogadores[i].setNumero(2);
            }
            else if(i == 2) {
                this.jogadores[i].setPosicao("Zagueiro");
                this.jogadores[i].setNumero(3);
            }
            else if(i == 3) {
                this.jogadores[i].setPosicao("Zagueiro");
                this.jogadores[i].setNumero(4);
            }
            else if(i == 4) {
                this.jogadores[i].setPosicao("Lateral direito");
                this.jogadores[i].setNumero(6);
            }
            else if(i == 5) {
                this.jogadores[i].setPosicao("Volante");
                this.jogadores[i].setNumero(5);
            }
            else if(i == 6) {
                this.jogadores[i].setPosicao("Meio-campo central");
                this.jogadores[i].setNumero(7);
            }
            else if(i == 7) {
                this.jogadores[i].setPosicao("Meio-campo central");
                this.jogadores[i].setNumero(8);
            }
            else if(i == 8) {
                this.jogadores[i].setPosicao("Ponta esquerda");
                this.jogadores[i].setNumero(10);
            }
            else if(i == 9) {
                this.jogadores[i].setPosicao("Centro-avante");
                this.jogadores[i].setNumero(9);
            }
            else if(i == 10) {
                this.jogadores[i].setPosicao("Ponta direita");
                this.jogadores[i].setNumero(11);
            }

        }
    }

}

