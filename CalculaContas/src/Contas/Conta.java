package Contas;

public class Conta {
    private static int total;
    private double saldo;

    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public int getTotal(){
        return Conta.total;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Por favor, informe um valor maior que 0");
            return;
        }
        this.agencia = agencia;
    }

    int agencia;
    int numero;

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    Cliente titular;

    void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int novoNumero){
        if(numero <= 0){
            System.out.println("Informe valor maior que 0");
            return;
        }
        this.numero = numero;
    }
}
