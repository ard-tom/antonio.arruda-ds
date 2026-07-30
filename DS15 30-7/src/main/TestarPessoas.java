package main;

public class TestarPessoas {
    public static void main(String[] args){
        Cliente juninho = new Cliente("Juninho", "123.456.789-00", 25, "Cartão de Crédito");
        System.out.println("===Cliente===");
        juninho.dadosCliente();
        Vendedor claudiao = new Vendedor("Claudiao", "987.654.321-99", 34,"Bola de Futebol");
        System.out.println("===Vendedor===");
        claudiao.dadosVendedor();
    }
}
