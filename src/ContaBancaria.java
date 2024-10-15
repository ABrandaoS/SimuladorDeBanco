public abstract class ContaBancaria implements Conta {
    protected int agencia;
    protected int tipoCorrente;
    protected int tipoPoupanca;
    protected int numeroConta;
    protected double saldo;

    public ContaBancaria(int agencia, String tipoCorrente001, int contaCorrente) {
        this.agencia = agencia;
        try {
            this.tipoCorrente = Integer.parseInt(tipoCorrente001);
        } catch (NumberFormatException e) {
            System.err.println("Tipo de conta inválida. Informe o tipo válido: 001");
        }
        this.numeroConta = contaCorrente;
    }

    public ContaBancaria(int agencia, int tipoPoupanca013, int contaPoupanca) {
        this.agencia = agencia;
        this.tipoPoupanca = tipoPoupanca013;
        this.numeroConta = contaPoupanca;
    }



    @Override
    public void consultarSaldo(){
        System.out.println("Saldo R$ " + this.saldo);
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Realizando saque de R$ " + valor);
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Sacado R$ " + valor);
        } else {
            System.err.println("Você tá quebrado!");
        }
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Realizando depósito de R$ " + valor);
        this.saldo += valor;
        System.out.println("Depositado R$ " + valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor <= this.saldo){
            System.out.println("Preparando saque para transferência...");
            this.sacar(valor);
            System.out.println("Preparando deposito para transferência...");
            contaDestino.depositar(valor);
            System.out.println("Faz me rir transferido!");
        } else {
            System.err.println("Você tá quebrado!!");
        }
    }
}