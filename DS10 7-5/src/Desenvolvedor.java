public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return super.getSalarioBase()*1.10;
    }
}
