
public class Main {
    public static void main(String[] args) {

        try {
            Banco banco = new Banco();

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
                    "26/04/1994",
                    enderecoAlexandre);
            System.out.println(banco.toString());
            System.out.println(enderecoAlexandre.toString());
            System.out.println(alexandre.toString());

            ContaCorrente contaCorrente = new ContaCorrente(1357, "001", 235689);
            contaCorrente.depositar(1413.04);
            contaCorrente.sacar(25);
            System.out.println(contaCorrente.toString());

            ContaPoupanca contaPoupanca = new ContaPoupanca(1357, 013, 124679);
            contaCorrente.transferir(364.26, contaPoupanca);
            System.out.println(contaPoupanca.toString());
            contaPoupanca.consultarSaldo();
            contaPoupanca.sacar(2000);

            // throw new RuntimeException("Exceção forçada para testar o bloco");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}