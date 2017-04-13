package ADO_07;

class Gerente extends Funcionario implements Prioridade {

    private String departamento;
    private int senha;

    Gerente(String departamento, int senha) {
        this.departamento = departamento;
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {

        if(this.senha == senha && (this.departamento.equals("RH") || this.departamento.equals("Compras") || this.departamento.equals("Departamento Pessoal"))) {
            System.out.println("Gerente: Acesso permitido para " + this.departamento);
            return true;
        }
        else {
            System.out.println("Gerente: Acesso negado para " + this.departamento);
            return false;
        }

    }

}
