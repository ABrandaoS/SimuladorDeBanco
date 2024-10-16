public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(Banco banco, int agencia, int tipoPoupanca013, int contaPoupanca) {
        super(banco, agencia, tipoPoupanca013, contaPoupanca);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", tipoPoupanca=" + tipoPoupanca +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
