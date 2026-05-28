package main;
public class Imovel {
    private int idImovel;
    private String endereco;
    private double valor;
    
        public Imovel(int idImovel, String endereco, double valor){
            this.idImovel=idImovel;
            this.endereco=endereco;
            this.valor=valor;
        }
        public void getInfo(){
        System.out.println("ID: "+ idImovel);
        System.out.println("Endereco: "+ endereco);
        System.out.println("Valor: "+ valor);
        }
}
