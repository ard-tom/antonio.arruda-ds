public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Claudio", 54, 5400, "Matemática");
        p.exibirDados();
        System.out.println("Bônus: " + p.calcularBonus());
        Aluno a = new Aluno("Roberto", 15, 9, 9);
        a.exibirDados();
        a.verificarSituacao();
    }
}
