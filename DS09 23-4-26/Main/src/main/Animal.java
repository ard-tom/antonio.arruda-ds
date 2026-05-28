package main;

    public class Animal {
    private String nome;
    private int comprimento;
    private int num_patas;
    private String cor;
    private String ambiente;
    private float vel_media;

        public Animal(String nome, int comprimento, int num_patas, String cor, String ambiente, float vel_media) {
            this.nome = nome;
            this.comprimento = comprimento;
            this.num_patas = num_patas;
            this.cor = cor;
            this.ambiente = ambiente;
            this.vel_media = vel_media;
        }

        public static void main(String[] args) {

        }

        public String getNome(){
            return nome;
        }
        public void setNome(String nome){}

        public int getComprimento(){
            return comprimento;
        }
        public void setComprimento(int comprimento){}

        public int getNum_patas(){
            return num_patas;
        }
        public void setNum_patas(int num_patas){}

        public String getCor(){
            return cor;
        }
        public void setCor(String cor){}

        public String getAmbiente(){
            return ambiente;
        }
        public void setAmbiente(String ambiente){}

        public float getVel_media(){
            return vel_media;
        }
        public void setVel_media(float vel_media){}

        public void dados(){
            System.out.println("Nome: " + this.nome);
            System.out.println("Comprimento: " + this.comprimento + "cm");
            System.out.println("Num_patas: " + this.num_patas);
            System.out.println("Cor: " + this.cor);
            System.out.println("Ambiente: " + this.ambiente);
            System.out.println("Vel_media: " + this.vel_media + "m/s");
        }
    }
