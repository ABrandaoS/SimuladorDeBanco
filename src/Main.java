
public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Endereco enderecoAlexandre = new Endereco(
                "Q46 C15",
                "Vila São José (Brazlândia)",
                "Brasília",
                "DF",
                "72.746-006"
        );
        Pessoa alexandre = new Pessoa(
                "Alexandre Brandão Santana",
                "123.456.789-00",
                "26/04/1994",
                enderecoAlexandre);
        System.out.println(banco.toString());
        System.out.println(enderecoAlexandre.toString());
        System.out.println(alexandre.toString());
    }
}