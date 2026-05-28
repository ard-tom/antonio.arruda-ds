package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Coloque a primeira nota: ");
        int n1 = sc.nextInt();
        
        System.out.print("Coloque a segunda nota: ");
        int n2 = sc.nextInt();
        
        System.out.print("Coloque a terceira nota: ");
        int n3 = sc.nextInt();
        
        System.out.print("Coloque a quarta nota: ");
        int n4 = sc.nextInt();
        
        System.out.print("Coloque a quinta nota: ");
        int n5 = sc.nextInt();
        
        float media = (n1 + n2 + n3 + n4 + n5) / 5;
        
        System.out.println("A media do aluno eh: " + media);
        
        sc.close();
    }
    
}
