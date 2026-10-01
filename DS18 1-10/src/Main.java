import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int idade = 0;
            System.out.println("Insira sua idade: ");
            idade = Integer.parseInt(sc.nextLine());
            if (idade > 120){
                throw new excecao1("Idosístico");
            } else {
                System.out.println("Idade " + idade + " válida!");
            }
        } catch (excecao1 e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}