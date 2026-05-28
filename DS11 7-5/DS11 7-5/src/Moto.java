public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularConsumo(){
        return 30.0 - (this.cilindradas / 100.0);
    }
}
