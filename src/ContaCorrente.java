public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(int agencia, String tipoCorrente001, int contaCorrente){
        super(agencia, tipoCorrente001, contaCorrente);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", tipoCorrente=" + tipoCorrente +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
