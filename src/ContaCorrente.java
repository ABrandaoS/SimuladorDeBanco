public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(Banco banco, int agencia, String tipoCorrente001, int contaCorrente){
        super(banco, agencia, tipoCorrente001, contaCorrente);
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
