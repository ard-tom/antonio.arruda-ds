import java.util.Scanner;

class Sala_de_aula {
    String nome;
    String professor;
    int id;
}
public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Sala_de_aula minhaSala = new Sala_de_aula();

        System.out.println("Coloque o nome do aluno: ");
        minhaSala.nome = sc.nextLine();

        System.out.println("Coloque o nome do professor: ");
        minhaSala.professor = sc.nextLine();

        System.out.println("Coloque o ID da sala de aula: ");
        minhaSala.id = sc.nextInt();

        System.out.println("--Resumo do cadastro-- \nNome do aluno: " + minhaSala.nome + "\nNome do professor: " + minhaSala.professor + "\nID da sala: " + minhaSala.id);

        System.out.println("Gostaria de atualizar os dados? (s/n)\n");
        char user_input = Character.toLowerCase(sc.next().charAt(0));

        if (user_input == 's'){
            System.out.println("Coloque o nome do aluno: ");
            minhaSala.nome = sc.nextLine();

            System.out.println("Coloque o nome do professor: ");
            minhaSala.professor = sc.nextLine();

            System.out.println("Coloque o ID da sala de aula: ");
            minhaSala.id = sc.nextInt();
        }
        else {
            System.out.println("Tudo bem. Gostaria de consultar-los novamente? (s/n)\n");
            char user_input2 = Character.toLowerCase(sc.next().charAt(0));
            if (user_input2 == 's'){
                System.out.println("--Resumo do cadastro-- \nNome do aluno: " + minhaSala.nome + "\nNome do professor: " + minhaSala.professor + "\nID da sala: " + minhaSala.id);
            }
            else {
                System.out.println("Tudo bem. Até a próxima.");
            }
        }

        sc.close();
    }
}