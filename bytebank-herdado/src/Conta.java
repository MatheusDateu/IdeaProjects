public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é= " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public double deposita(double valor){
        this.saldo = this.saldo + valor;
        return valor;
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saca(valor)){
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }

    public boolean saca(double valor) {
        if (valor <=saldo) {
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double valor){
        return this.saldo += valor;
    }
}
