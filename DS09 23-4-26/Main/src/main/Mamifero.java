package main;

public class Mamifero extends Animal {
    private String alimento;

    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {}

    public Mamifero(String nome, int comprimento, int num_patas, String cor, String ambiente, float vel_media, String alimento) {
        super(nome, comprimento, num_patas, cor, ambiente, vel_media);
        this.alimento = alimento;
    }
    
    public void dadosMamifero(){
        super.dados();
        System.out.println(alimento);
    }
}
