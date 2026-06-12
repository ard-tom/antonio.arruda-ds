public class Medico extends ProfissionalSaude implements Atendimento{
    public Medico(String nome, String cpf, int idade, String registroProfissional) {
        super(nome, cpf, idade, registroProfissional);
    }

    private String especialidade;
    private int numeroPlantao;
    private double salarioBase;

    public Medico(String nome, String cpf, int idade, String registroProfissional, String especialidade, int numeroPlantao, double salarioBase) {
        super(nome, cpf, idade, registroProfissional);
        this.especialidade = especialidade;
        this.numeroPlantao = numeroPlantao;
        this.salarioBase = salarioBase;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getNumeroPlantao() {
        return numeroPlantao;
    }

    public void setNumeroPlantao(int numeroPlantao) {
        this.numeroPlantao = numeroPlantao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void realizarAtendimento(){
        System.out.print("Realizando atendimento!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Registro Profissional: " + this.getRegistroProfissional());
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Número do plantão: " + this.numeroPlantao);
        System.out.println("Salário fixo: " + this.salarioBase);
    }

    @Override
    public double calcularSalario() {
        super.calcularSalario();
        System.out.println("Salário com bônus: " + (this.salarioBase + 500.00));
        return this.salarioBase + 500;
    }
}
