package main;

public class Peixe extends Animal {
    private String caracteristica;
    public String getCaracteristica() {
        return caracteristica;
    }
    public void setCaracteristica(String caracteristica) {}

    public Peixe(String nome, int comprimento, int num_patas, String cor, String ambiente, float vel_media, String caracteristica) {
        super(nome, comprimento, num_patas, cor, ambiente, vel_media);
        this.caracteristica = caracteristica;
    }

    public void dadosPeixe(){
        super.dados();
        System.out.println(caracteristica);
    }

}
