public class Banco {
    private final String NOME = "BANCO DIGITAL";
    private final String CNPJ = "12.345.678/0001-00";
    private final int CODIGO = 162;
    private final String ENDERECO = "WWW.INTERNET.COM";
    private final String CONTATO = "CALL@ME.COM";

    @Override
    public String toString() {
        return "Banco{" +
                "NOME='" + NOME + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", CODIGO=" + CODIGO +
                ", ENDERECO='" + ENDERECO + '\'' +
                ", CONTATO='" + CONTATO + '\'' +
                '}';
    }

    public String getNOME() {
        return NOME;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public int getCODIGO() {
        return CODIGO;
    }

    public String getENDERECO() {
        return ENDERECO;
    }

    public String getCONTATO() {
        return CONTATO;
    }
}