import java.util.Objects;

public class Enfermeiro extends ProfissionalSaude implements Atendimento{
    public Enfermeiro(String nome, String cpf, int idade, String registroProfissional) {
        super(nome, cpf, idade, registroProfissional);
    }

    private String turno;
    private double salarioBase;
    public double bonusTurno;

    public Enfermeiro(String nome, String cpf, int idade, String registroProfissional, String turno, double salarioBase) {
        super(nome, cpf, idade, registroProfissional);
        this.turno = turno;
        this.salarioBase = salarioBase + bonusTurno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        super.calcularSalario();
        if (this.turno == "Noturno"){
            bonusTurno = this.salarioBase * 0.20;
            return (this.salarioBase + bonusTurno);
        }
        else {
            return this.salarioBase;
        }
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Realizando atendimento!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Turno: " + this.turno);
        System.out.println("Salário fixo: " + this.salarioBase);
        System.out.println("Salário com bônus: " + calcularSalario());
    }

}
