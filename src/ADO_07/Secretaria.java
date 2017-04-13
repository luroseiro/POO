package ADO_07;

public class Secretaria extends Funcionario implements Prioridade {

    private String idiomaFalado;
    private int senha;

    Secretaria(String idiomaFalado, int senha) {
        this.idiomaFalado = idiomaFalado;
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {

        if(this.senha == senha && this.idiomaFalado.equals("Inglês")) {
            System.out.println("Secretaria: Acesso permitido para idioma " + this.idiomaFalado);
            return true;
        }
        else {
            System.out.println("Secretaria: Acesso negado para idioma " + this.idiomaFalado);
            return false;
        }

    }

}
