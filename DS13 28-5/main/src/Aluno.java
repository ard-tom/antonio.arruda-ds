public class Aluno extends Pessoa {
    private int nota1;
    private int nota2;

    public Aluno(String nome, int idade, int nota1, int nota2) {
        super(nome, idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public double calcularBonus() {
        return 0;
    }

    public int calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }
    public void verificarSituacao(){
        if (calcularMedia() >= 6){
            System.out.println("Aprovado! A média do aluno é: " + calcularMedia());
        }
        else if (calcularMedia() > 4 && calcularMedia() < 6){
            System.out.println("Recuperação! A média do aluno é: " + calcularMedia());
        }
        if (calcularMedia() < 4) {
            System.out.println("Reprovado! A média do aluno é: " + calcularMedia());
        }
    }
}