package main;

public class Vendedor extends Pessoa{
    private String produto;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Vendedor(String nome, String cpf, int idade, String produto) {
        super(nome, cpf, idade);
        this.produto = produto;
    }

    public void dadosVendedor(){
        super.dados();
        System.out.println(produto);
    }
}
