public abstract class ContaBancaria implements Conta {
    protected double saldo;

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo R$ " + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacou R$ " + valor);
        } else {
            System.err.println("Você tá quebrado!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositou R$  " + valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo){
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência foi feita!");
        } else {
            System.err.println("Você tá quebrado!!");
        }
    }
}