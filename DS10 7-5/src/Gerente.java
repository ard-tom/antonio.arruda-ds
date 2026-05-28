public class Gerente extends Funcionario {

    double bonusFixo=2000;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return super.getSalarioBase()+bonusFixo;
    }
}