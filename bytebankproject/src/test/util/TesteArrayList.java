package test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

    }
}
