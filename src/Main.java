import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            Banco banco = null;
            int opcao;

                do {
                    System.out.println("Infome a opção desejada: ");
                    System.out.println("[1] CADASTRAR BANCO: ");
                    System.out.println("[2] CONSULTAR BANCO: ");
                    System.out.println("[3] CADASTRAR ENDERECO: ");
                    System.out.println("[4] CONSULTAR ENDERECO: ");
                    System.out.println("[5] CADASTRAR PESSOA: ");
                    System.out.println("[6] CONSULTAR PESSOA: ");
                    System.out.println("[7] CADASTRAR CONTA CORRENTE: ");
                    System.out.println("[8] CONSULTAR CONTA CORRENTE: ");
                    System.out.println("[9] CADASTRAR CONTA POUPANÇA: ");
                    System.out.println("[10] CONSULTAR CONTA POUPANÇA: ");
                    System.out.println("[99] SAIR: ");

                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcao) {
                        case 1:
                            System.out.print("Informe o nome do banco: ");
                            String nomeBanco = scanner.nextLine();
                            System.out.print("Digite o CNPJ: ");
                            String cnpj = scanner.nextLine();
                            if (!cnpj.matches("\\d{14}")) {
                                System.out.println("CNPJ inválido. Deve conter exatamente 14 dígitos.");
                                break;
                            }
                            System.out.print("Digite o código compe: ");
                            String codigoCompe = scanner.next();
                            scanner.nextLine();
                            System.out.print("Informe o contato: ");
                            String contato = scanner.nextLine();
                            banco = new Banco(nomeBanco, cnpj, codigoCompe, contato);
                            System.out.println("Banco cadastrado com sucesso");
                            break;
                        case 2:
                            if (banco != null) {
                                System.out.println("Consultando: " + banco.toString());
                            } else {
                                System.out.println("Nenhum banco cadastrado ainda.");
                            }
                    }
                } while (opcao != 99);



            /*
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
            */
            // throw new RuntimeException("Exceção forçada para testar o bloco");

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}