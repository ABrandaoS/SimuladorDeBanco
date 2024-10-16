public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, String dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.cpf = formatarCpf(cpf);
        this.dataNascimento = formatarDataNascimento(dataNascimento);
        this.endereco = endereco;
    }

    public static String formatarCpf(String cpf) {
        if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d+")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        return cpf.substring(0,3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9, 11);
    }

    public static String formatarDataNascimento(String dataNascimento){
        if (dataNascimento == null || dataNascimento.length() != 8 || !dataNascimento.matches("\\d+")) {
            throw new IllegalArgumentException("Data nascimento inválida");
        } return dataNascimento.substring(0, 2) + "/" + dataNascimento.substring(2, 4) + "/" + dataNascimento.substring(4, 8);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", endereco=" + endereco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
