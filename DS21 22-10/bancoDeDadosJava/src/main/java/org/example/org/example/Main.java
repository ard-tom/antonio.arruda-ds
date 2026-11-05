package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        String server = "localhost";
        String port = "3306";
        String database = "meubanco";
        String user = "root";
        String passwd = "";

        String url = "jdbc:mysql://" + server + ":" + port + "/" + database;
        try {
            System.out.println("Conectando ao Banco de Dados...");
            Connection conexao = DriverManager.getConnection(url, user, passwd);
            System.out.println("Conexão efetuada com sucesso!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados.");
            e.printStackTrace();
        }
    }

}