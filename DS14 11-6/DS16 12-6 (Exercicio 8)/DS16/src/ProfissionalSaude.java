public abstract class ProfissionalSaude extends Pessoa {
    private String registroProfissional;

    public ProfissionalSaude(String nome, String cpf, int idade, String registroProfissional) {
        super(nome, cpf, idade);
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public double calcularSalario(){
        return 0;
    }

}
