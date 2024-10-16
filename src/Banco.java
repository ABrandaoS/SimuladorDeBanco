public class Banco {
    private String razaoSocial;
    private String cnpj;
    private String codigoCompe;
    private String contato;

    public Banco(String nomeBanco, String cnpjBanco, String codigoCompe, String contatoBanco) {
        this.razaoSocial = nomeBanco;
        this.cnpj = formatarCnpj(cnpjBanco);
        this.codigoCompe = codigoCompe;
        this.contato = contatoBanco;
    }

    private static String formatarCnpj(String cnpj) {
        if (cnpj == null || !cnpj.matches("\\d{14}")) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        return cnpj;
    }

    private static String formatarCompe(int codigoCompe) {
        if (codigoCompe < 0 || codigoCompe > 999) {
            throw new IllegalArgumentException("Código COMPE deve estar entre 0 e 999.");
        }
        return String.format("%03d", codigoCompe);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "NOME='" + razaoSocial + '\'' +
                ", CNPJ='" + cnpj + '\'' +
                ", CODIGO=" + codigoCompe +
                ", CONTATO='" + contato + '\'' +
                '}';
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCodigoCompe() {
        return codigoCompe;
    }

    public void setCodigoCompe(String codigoCompe) {
        this.codigoCompe = codigoCompe;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}