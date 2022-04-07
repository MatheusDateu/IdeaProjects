package Contas;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(54, 45);

        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());

        conta.setAgencia(1232123);

        Conta conta2 = new Conta(1337, 16549);

        System.out.println(conta.getTotal());
    }
}