import java.util.Scanner;

public class Aluno {

    private double notaParcial1, notaParcial2 = 0;
    private String nome;
    private String status;

    public Aluno(String nome, String status, double notaParcial1, double notaParcial2) {
        this.nome = nome;
        this.status = status;
        this.notaParcial1 = notaParcial1;
        this.notaParcial2 = notaParcial2;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getNotaParcial1() {
        return notaParcial1;
    }

    public void setNotaParcial1(double notaParcial1) {
        this.notaParcial1 = notaParcial1;
    }

    public double getNotaParcial2() {
        return notaParcial2;
    }

    public void setNotaParcial2(double notaParcial2) {
        this.notaParcial2 = notaParcial2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {

    }
}
