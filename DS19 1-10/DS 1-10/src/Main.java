import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int saque = 0;
            int saldo = 0;
            System.out.println("Insira o valor do seu saldo bancário: ");
            saldo = sc.nextInt();
            System.out.println("Insira o valor do saque: ");
            saque = sc.nextInt();
            if (saque > saldo){
                throw new saldoinsuficienteexception("Saque inválido; saldo insuficiente!");
            } else if (saque <= 0) {
                throw new illegalargumentexception2("Saque inválido! Valor menor ou igual a zero");
            } else {
                System.out.println("Saque realidado com sucesso. Saldo disponível: " + (saldo - saque));
            }

        } catch (saldoinsuficienteexception | illegalargumentexception2 e) {
            System.out.println(e.getMessage());
        }
    }
}