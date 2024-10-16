public class Banco {
    private String razaoSocial;
    private String cnpj;
    private int codigoCompe;
    private String contato;

    private static String formatarCnpj(String cnpj) {
        if (cnpj == null || cnpj.length() != 14 || !cnpj.matches("\\d+")) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        return cnpj.substring(0,2) + "." + cnpj.substring(2,5) + "." + cnpj.substring(5,8) + "/" + cnpj.substring(8, 12) + "-" + cnpj.substring(12,14);
    }

    private static String formatarCompe(int codigoCompe) {
        if (codigoCompe < 0 || codigoCompe > 999) {
            throw new IllegalArgumentException("Código COMPE deve estar entre 0 e 999.");
        }
        return String.format("%03d", codigoCompe);
    }

    public Banco(String nome, String cnpj, int codigo, String contato) {
        this.razaoSocial = nome;
        this.cnpj = formatarCnpj(cnpj);
        this.codigoCompe = codigo;
        this.contato = contato;
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

    public int getCodigoCompe() {
        return codigoCompe;
    }

    public void setCodigoCompe(int codigoCompe) {
        this.codigoCompe = codigoCompe;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}