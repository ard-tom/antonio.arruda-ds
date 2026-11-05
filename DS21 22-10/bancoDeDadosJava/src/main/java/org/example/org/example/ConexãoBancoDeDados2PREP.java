package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConexãoBancoDeDados2PREP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String server = "localhost";
        String port = "3306";
        String database = "meubanco";
        String user = "root";
        String passwd = "";
        String url = "jdbc:mysql://" + server + ":" + port + "/" + database;


        String instrucaoSQLinserir = "INSERT INTO aluno (matricula, nome, email, idade) " + "VALUES (?, ?, ?, ?)";
        // String sql = "Insert funcionario SET nome = ?, email = ? WHERE id = ?"; > dentro de uma classe pública 'inserir'
        // String sql = "UPDATE aluno SET nome = ?, email = ? WHERE id = ?"; > dentro de uma classe pública 'atualizar'
        // String sql = "DELETE FROM funcionario WHERE id = ?"; > dentro de uma classe pública 'deletar'
        // String sql = "SELECT * FROM funcionario WHERE id = ?"; > dentro de uma classe pública 'procurar'

        try {
            System.out.println("Conectando ao Banco de Dados...");
            Connection conexao = DriverManager.getConnection(url, user, passwd);
            System.out.println("Conexão efetuada com sucesso!");
            System.out.println("Inserindo dados na tabela...");

            PreparedStatement stmt = conexao.prepareStatement(instrucaoSQLinserir);

            System.out.println("Gostaria de inserir dados na tabela 'alunos'?");
            String respostaUser = sc.nextLine();

          if (respostaUser.toLowerCase().equals("sim".toLowerCase()) ) {
              stmt = conexao.prepareStatement(instrucaoSQLinserir);
            while (true) {


                System.out.println("Insira o número da matrícula do aluno: ");
                int matriculaAluno = Integer.parseInt(sc.nextLine());
                stmt.setInt(1, matriculaAluno);

                System.out.println("Insira o nome do aluno: ");
                String nomeAluno = sc.nextLine();
                stmt.setString(2, nomeAluno);

                System.out.println("Insira o email do aluno: ");
                String emailAluno = sc.nextLine();
                stmt.setString(3, emailAluno);

                System.out.println("Insira a idade do aluno: ");
                int idadeAluno = Integer.parseInt(sc.nextLine());
                stmt.setInt(4, idadeAluno);


                stmt.executeUpdate();

                System.out.println("Dados inseridos com sucesso!");
            }
          } else {
              System.out.println("Certo, Finalizando...");
          }

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou inserir dados.");
            e.printStackTrace();
        }
    }
}