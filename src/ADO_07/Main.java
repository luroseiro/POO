package ADO_07;

public class Main {

    public static void main(String[] args) {

        Motorista motorista = new Motorista("123465789");
        Engenheiro engenheiro = new Engenheiro("123456789");

        Secretaria sec1 = new Secretaria("Inglês", 12345);
        Secretaria sec2 = new Secretaria("Inglês", 98765);
        Secretaria sec3 = new Secretaria("Espanhol", 56789);

        sec1.autentica(12345);
        sec2.autentica(98765);
        sec3.autentica(56468);

        Gerente ge1 = new Gerente("RH", 123456);
        Gerente ge2 = new Gerente("Compras", 987654);
        Gerente ge3 = new Gerente("Departamento Pessoal", 567890);
        Gerente ge4 = new Gerente("Vendas", 564723);

        ge1.autentica(123456);
        ge2.autentica(987654);
        ge3.autentica(5678);
        ge4.autentica(564723);

    }

}
