public class CriaConta {

    public static void main(String[] args) {
        Conta firstConta = new Conta();
        firstConta.saldo = 200;
        System.out.println(firstConta.saldo);

        firstConta.saldo += 100;
        System.out.println(firstConta.saldo);

        Conta secondConta = new Conta();
        secondConta.saldo = 50;
        System.out.println("Primeira conta: " + firstConta.saldo);
        System.out.println("Segunda conta: " + secondConta.saldo);

        System.out.println(firstConta);
        System.out.println(secondConta);
    }
}