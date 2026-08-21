package main;

public class Cliente extends Pessoa {
    private String metodoPagamento;

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String MetodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public Cliente(String nome, String cpf, int idade, String metodoPagamento) {
        super(nome, cpf, idade);
        this.metodoPagamento = metodoPagamento;
    }

    public void dadosCliente(){
        super.dados();
        System.out.println(metodoPagamento);
    }
}
