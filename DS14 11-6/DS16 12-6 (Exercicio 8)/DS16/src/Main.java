public class Main {
    public static void main (String[] args) {

        Medico drMedico1 = new Medico("Adalberto", "123.456.789-00", 65, "CRM", "Coisas", 24, 15000.00);
        System.out.println("=== Médico ===");
        drMedico1.exibirInformacoes();
        drMedico1.calcularSalario();
        drMedico1.realizarAtendimento();
        System.out.println("\n");

        Enfermeiro enfermeiro1 = new Enfermeiro("Joseclaudiosträgovich", "987.654.321-00", 67, "COEM", "Noturno", 12000.00);
        System.out.println("=== Enfermeiro ===");
        enfermeiro1.exibirInformacoes();
        enfermeiro1.realizarAtendimento();
    }
}