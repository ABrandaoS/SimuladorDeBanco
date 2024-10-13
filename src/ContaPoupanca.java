public class ContaPoupanca extends ContaBancaria{

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", tipoPoupanca=" + tipoPoupanca +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }

    public ContaPoupanca(int agencia, int tipoPoupanca013, int contaPoupanca) {
        super(agencia, tipoPoupanca013, contaPoupanca);

    }
}
