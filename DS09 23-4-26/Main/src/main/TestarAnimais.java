package main;

public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Árido", 2f, "Plantas do deserto");
        System.out.println("=====Camelo=====");
        camelo.dadosMamifero();
        Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
        System.out.println("=====Tubarao=====");
        tubarao.dadosPeixe();
        Mamifero urso = new Mamifero("Urso-do-Canadá", 180, 4, "Vermelho", "Terra", 0.5f, "Mel");
        System.out.println("=====Urso=====");
        urso.dadosMamifero();
    }
}
