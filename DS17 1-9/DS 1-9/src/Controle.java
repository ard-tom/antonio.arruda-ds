import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Controle {
    List<Aluno> listaAlunos = new ArrayList();

    double mediaPorAluno = 0;

    public void inserir() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            double nota, nota2 = 0;
            String nome;
            String status = "";
            String saida = "fim";

            System.out.println("Digite o nome do aluno: ");
            nome = sc.nextLine();

                if (nome.equals(saida)){
                    break;
                }

            System.out.print("Digite um número para a primeira nota parcial do aluno: \n");
            nota = sc.nextDouble();

            System.out.println("Digite um número para a segunda nota parcial do aluno: ");
            nota2 = sc.nextDouble();

            sc.nextLine();

//            if (sc.hasNextInt()) {
//                nota = sc.nextDouble();
//
//                    System.out.print("Digite um número para a Segunda nota parcial do aluno: ");
//
//                    if (sc.hasNextInt()) {
//                        nota2 = sc.nextDouble();
//
//                    } else {
//                        System.out.println("Entrada inválida! Digite um número inteiro.");
//                        sc.next(); // descarta a entrada inválida para não travar o loop
//                    }

                mediaPorAluno = nota + nota2 / 2;

                if (mediaPorAluno < 40) {
                    status = "Reprovado";
                } else if (mediaPorAluno < 70) {
                    status = "Final";
                } else {
                    status = "Aprovado";
                }

            listaAlunos.add(new Aluno(nome, status, nota, nota2));
        }
    }

        public void percorreLista () {
            if (listaAlunos.isEmpty()) {
                System.out.println("Não tem nada aqui");
            } else {
                for (Aluno indice : listaAlunos) {
                    System.out.println("Nome: " + indice.getNome());
                    System.out.println("Nota1: " + indice.getNotaParcial1());
                    System.out.println("Nota2: " + indice.getNotaParcial2());
                    System.out.println("Status: " + indice.getStatus());
                }
            }
        }

        public void removerElementoLista () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Gostaria de remover um elemento? (0 para não)");
            int indice = Integer.parseInt(sc.nextLine());
            if (indice == 0) {
                System.out.println("\n");
            }
            if (indice >= 0 || indice < listaAlunos.size()) {
                listaAlunos.remove(indice);
            } else {
                System.out.println("Índice errado aí");
            }
            sc.close();
        }

        public void resenha () {

            Scanner sc = new Scanner(System.in);
            double mediaTurma = 0;

            double soma = 0;
            int contador = 0; // conta quantos números foram encontrados

            for (Aluno item : listaAlunos) {
                soma += (Double) item.getNotaParcial1();// faz o "cast" pra Double e soma
                soma += (double) item.getNotaParcial2();
                contador++;
            }


            if (contador > 0) {
                mediaTurma = soma / contador;
            }

            int alunosAprovados = 0, alunosReprovados = 0, alunosFinais = 0;

            for (Aluno aluno : listaAlunos) {
                if (aluno.getStatus().equals("Aprovado")) {
                    alunosAprovados++;
                } else if (aluno.getStatus().equals("Reprovado")) {
                    alunosReprovados++;
                } else if (aluno.getStatus().equals("Final")) {
                    alunosFinais++;
                }
            }

            System.out.println("----------Resumo----------");
            System.out.println("Alunos Aprovados: " + alunosAprovados);
            System.out.println("Alunos Reprovados: " + alunosReprovados);
            System.out.println("Alunos na Final: " + alunosFinais);
            sc.close();
        }

        public void mostrarReprovados () {
            for (Aluno aluno : listaAlunos) {
                if (aluno.getStatus().equals("Reprovado")) {
                    System.out.println("----------Reprovados----------");
                    System.out.println("Nome: " + aluno.getNome());
                    System.out.println("Nota1: " + aluno.getNotaParcial1());
                    System.out.println("Nota2: " + aluno.getNotaParcial2());
                    System.out.println("--------------------");
                }
            }
        }

        public static void main (String[]args){
            Controle c = new Controle();
            c.inserir();
            c.removerElementoLista();
            c.percorreLista();
            c.resenha();
            c.mostrarReprovados();
        }
    }
