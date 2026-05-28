public class Main {
    public static void main(String[] args){
        Carro c = new Carro("abc", "123", 200);
        c.exibirInformacoes();
        System.out.println(c.calcularConsumo());
        Moto m = new Moto("Motoca", "Radical", 200);
        m.exibirInformacoes();
        System.out.println(m.calcularConsumo());
        Caminhao ca = new Caminhao("Camenhao", "Potente", 12000);
        ca.exibirInformacoes();
        System.out.println(ca.calcularConsumo());
    }
}
