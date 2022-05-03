package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Object[] referencias;
    private int posicaaLivre;

    public GuardadorDeContas(){
        this.referencias = new Object[10];
        this.posicaaLivre = 0;
    }
    public void adiciona(Object ref){
        this.referencias[this.posicaaLivre] = ref;
        this.posicaaLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaaLivre;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
