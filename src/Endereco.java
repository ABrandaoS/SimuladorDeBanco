import java.text.DecimalFormat;

public class Endereco {
    private String linha1;
    private String linha2;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String linha1, String linha2, String cidade, String estado, String cep) {
        this.linha1 = linha1;
        this.linha2 = linha2;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = formatarCep(cep);
    }

    public static String formatarCep(String cep) {
        if (cep == null || cep.length() != 8 || !cep.matches("\\d+")) {
            throw new IllegalArgumentException("CEP inválido");
        }
        return cep.substring(0, 5) + "-" + cep.substring(5, 8);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "linha1='" + linha1 + '\'' +
                ", linha2='" + linha2 + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }

    public String getLinha1() {
        return linha1;
    }

    public void setLinha1(String linha1) {
        this.linha1 = linha1;
    }

    public String getLinha2() {
        return linha2;
    }

    public void setLinha2(String linha2) {
        this.linha2 = linha2;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}