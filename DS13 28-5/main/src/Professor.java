public class Professor extends Pessoa {
    private double salario;
    private String disciplina;


    public Professor(String nome, int idade, double salario, String disciplina) {
        super(nome, idade);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    @Override
    public double calcularBonus() {
        return (salario * 0.15);
    }
    public void exibirDados(){
        super.exibirDados();
        System.out.println(disciplina);
        System.out.println(salario);
    }
}
