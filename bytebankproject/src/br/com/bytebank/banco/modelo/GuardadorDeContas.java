package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaaLivre;

    public GuardadorDeContas(){
        this.referencias = new Conta[10];
        this.posicaaLivre = 0;
    }
    public void adiciona(Conta ref){
        this.referencias[this.posicaaLivre] = ref;
        this.posicaaLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaaLivre;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}
