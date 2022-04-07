package Contas;

public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(50, 40);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = paulo;
        paulo.setNome("Paulo Silveira");

        conta.setTitular(paulo);
        //System.out.println(conta.getTitular()); Result: Contas.Cliente@1b28cdfa
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        /*
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
         */
    }
}
