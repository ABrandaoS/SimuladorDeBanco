
public class Main {
    public static void main(String[] args) {

        try {
            Banco banco = new Banco("BANCO DIGITAL", "12345678901234", 15, "ME@CONTATO.COM");

            Endereco enderecoAlexandre = new Endereco(
                    "Q46 C15",
                    "Vila São José (Brazlândia)",
                    "Brasília",
                    "DF",
                    "72746006"
            );

            Pessoa alexandre = new Pessoa(
                    "Alexandre Brandão Santana",
                    "12345678900",
                    "01011900",
                    enderecoAlexandre);

            ContaCorrente contaCorrente = new ContaCorrente(banco, 2521, "1", 51231);

            ContaPoupanca contaPoupanca = new ContaPoupanca(banco, 3125, 13, 86273);

            System.out.println(banco.toString());
            System.out.println(alexandre.toString());
            System.out.println(enderecoAlexandre.toString());
            System.out.println(contaCorrente.toString());
            System.out.println(contaPoupanca.toString());

            contaCorrente.depositar(1413.04);
            contaCorrente.sacar(25);
            contaCorrente.transferir(364.26, contaPoupanca);
            contaPoupanca.consultarSaldo();
            contaPoupanca.sacar(2000);

            // throw new RuntimeException("Exceção forçada para testar o bloco");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}